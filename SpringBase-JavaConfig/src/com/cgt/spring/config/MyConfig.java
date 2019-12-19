package com.cgt.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cgt.spring.facade.IFortuneService;
import com.cgt.spring.facade.IMessageService;
import com.cgt.spring.services.SmsService;

@Configuration
@ComponentScan("com.cgt.spring")
@PropertySource("classpath:messages.properties")
public class MyConfig {

	/*@Bean
	public IMessageService msgService(IFortuneService service) {
		// put logic 
		return new SmsService(service);
	}*/
	
	@Bean
	public IMessageService msgService() {
		// put logic 
		return new SmsService();
	}
	
	
}
