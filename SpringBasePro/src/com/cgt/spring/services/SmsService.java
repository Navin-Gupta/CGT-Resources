package com.cgt.spring.services;

import com.cgt.spring.facade.IMessageService;

public class SmsService implements IMessageService {

	@Override
	public String sendMessage(String to, String message) {
		return "SMS send to : " + to + "[ " + message + " ]";
	}
}
