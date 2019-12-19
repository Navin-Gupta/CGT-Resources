package com.cgt.spring.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// import org.springframework.stereotype.Component;

import com.cgt.spring.facade.IFortuneService;
import com.cgt.spring.facade.IMessageService;


@Component
@Scope("prototype")
public class EmailService implements IMessageService {

	@Value("${email.sender}")
	private String sender;
	
	@PostConstruct
	public void initMethod() {
		
	}
	
	
	@Override
	public String sendMessage(String to, String message) {
		return "Email send to : " + to + "[ " + message + " ]";
	}
	
	@PreDestroy
	public void destroyMethod() {
		
	}
}
