package com.cgt.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgt.spring.facade.IMessageService;
// import com.cgt.spring.services.EmailService;

public class MyApp {

	public static void main(String[] args) {
		
		// creating and getting the ref of bean container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		// get the instance of service bean
		IMessageService service = context.getBean("emailService", IMessageService.class);
		String ack = service.sendMessage("Someone@mail.com", "Something...");
		System.out.println(ack);
		
		
		context.close();
		
	}

}
