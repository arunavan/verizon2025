package com.autowiring.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autowiring.service com.autowiring.repository")
public class AutowiringConfig {

}
