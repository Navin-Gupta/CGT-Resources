package com.cgt.spring.core.client;

import com.cgt.spring.core.services.EmailService;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailService service  = new EmailService();
		service.sendMessage("Someone", "Something...");
	}

}
