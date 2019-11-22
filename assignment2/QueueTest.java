package assignment2;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		
		 Queue q = new Queue(4);
		
		//1)----PRINT QUEUE ELEMENTS-----
		
		q.queueDisplay();
		
		//2)--INSERTING ELEMENTS IN QUEUE----
		q.queueEnqueue(20); 
        q.queueEnqueue(30); 
        q.queueEnqueue(40); 
        q.queueEnqueue(50); 
        q.queueDisplay();
        
        //3)---DELETING ELEMENTS IN QUEUE-----
        q.queueDequeue(); 
        q.queueDequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n");
        q.queueDisplay();
        
        //4)----SIZE OF QUEUE-----
        System.out.println(q.size());
        
        //5)----QUEUE IS EMPTY OR NOT-----
        
        System.out.println(q.isEmpty());
        
		
	}

}
