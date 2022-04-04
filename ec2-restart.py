#####################################################################################################################
# For restarting ec2 instance when status check failed:
######################################################################################################################

import json
import logging
import boto3
import os
import datetime
import dateutil.parser
import sys
import time
from dateutil import tz


log = logging.getLogger()
log.setLevel(logging.INFO)

client = boto3.client('sns')
ssm = boto3.client('ssm')
ec2 = boto3.client('ec2')
from enum import Enum

SUBJECT = "LUNT-Notification-P3-Lucanet-Instance-Restarted-by-Lambda"
DOCUMENT_NAME = 'Lucanet-Instance-Restart-Document'
MESSAGE_BODY = 'Lucanet Instance restarted due to {} alarm {}'

lucanet_identifier = ''

def is_json(myjson):
    try:
        json_object = json.loads(myjson)
    except ValueError as e:
        return False
    return True
    
def is_ignored(identifier):
    envs_to_ignore = list(x.strip() for x in os.environ['envs_to_ignore'].split(',')) if "envs_to_ignore" in os.environ else []
    return identifier in envs_to_ignore

def getInstanceIdFromDimensions(dimensions):
    instanceId = None
    for dimension in dimensions:
        if dimension['name'].lower() == 'instanceid':
            instanceId = dimension['value']
    # log.info("lucanet_identifier: {}, instanceId: {}".format(lucanet_identifier, instanceId))
    return instanceId

def executeRestart(instanceId,alarmName,lucanet_identifier):
    stopInstance(instanceId)
    instance = ec2.Instance(instanceId)
    while instance.state['Name'] not in ('stopped'):
        time.sleep(10)
        log.info("Instance is stopping ... ")
        instance.load()
    startInstance(instanceId)
    #client.publish(TopicArn=os.environ['snsarn'],Message = MESSAGE_BODY.format(alarmNumber,alarmName),Subject = SUBJECT +':'+ lucanet_identifier)
    # log.info("{} alarm, so restart executed. instanceId:{} alarmName:{}".format(alarmNumber, instanceId, alarmName))

def stopInstance(instance):
    ec2.stop_instances(InstanceIds=[instance])
    log.info('stopped instance: {}'.format(instance))

def startInstance(instance):
    ec2.start_instances(InstanceIds=[instance])
    log.info('started instance: {}'.format(instance))
    
def getInstance(instanceId):
    return ec2.describe_instances(InstanceIds = [instanceId])
    
def lambda_handler(event, context):

    # log.debug("event {}".format(event))
    if len(event['Records']) != 0:
        message = event['Records'][0]['Sns']['Message']
        # log.info("sns message {}".format(message))
        if is_json(message) == False:
            log.info("message is not a JSON")
            sys.exit(0)
        messageObj = json.loads(message)
        alarmName = str(messageObj['AlarmName'])      
        instanceId = getInstanceIdFromDimensions(messageObj['Trigger']['Dimensions'])
        # log.info("lucanet_identifier: {}, is_ignored: {}, threshold: {}".format(lucanet_identifier, is_ignored(lucanet_identifier), str(messageObj['Trigger']['EvaluationPeriods'])))
        stopInstance(instanceId)
        log.info("Stop Instance Executed .............")
    
        while True:
            instance = getInstance(instanceId)
            log.info('Instance : {}'.format(instance))
            ec2_state = instance["Reservations"][0]["Instances"][0]["State"]["Name"]
            log.info(' STATE : {}'.format(ec2_state))
            if(ec2_state == 'stopped'):
                startInstance(instanceId)
                break
            elif (ec2_state == 'running'):
                break
            else:
                time.sleep(10)
                log.info("Instance is Stopping ...... ")
