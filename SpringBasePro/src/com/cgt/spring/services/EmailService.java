package com.cgt.spring.services;

import com.cgt.spring.facade.IMessageService;

public class EmailService implements IMessageService {

	@Override
	public String sendMessage(String to, String message) {
		return "Email send to : " + to + "[ " + message + " ]";
	}
}
