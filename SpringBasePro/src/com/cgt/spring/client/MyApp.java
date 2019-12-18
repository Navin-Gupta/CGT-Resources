package com.cgt.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgt.spring.facade.IMessageService;
// import com.cgt.spring.services.EmailService;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EmailService service  = new EmailService();
		
		// getting the ref of bean factory
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the instance of service bean
		IMessageService service = context.getBean("msgService", IMessageService.class);
		String ack = service.sendMessage("Someone", "Something...");
		// System.out.println(ack);
	}

}
