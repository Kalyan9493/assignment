package com.omni.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.omni.controller","com.omni.config.model"})
public class LoginConfig {

}
