package com.cgt.spring.services;

import org.springframework.stereotype.Component;

// import org.springframework.stereotype.Component;

import com.cgt.spring.facade.IFortuneService;
import com.cgt.spring.facade.IMessageService;


@Component
public class EmailService implements IMessageService {

	
	@Override
	public String sendMessage(String to, String message) {
		return "Email send to : " + to + "[ " + message + " ]";
	}
	
}
