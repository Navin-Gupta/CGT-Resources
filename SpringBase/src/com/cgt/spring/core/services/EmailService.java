package com.cgt.spring.core.services;

public class EmailService {

	public String sendMessage(String to, String message) {
		return "Email send to : " + to + "[ " + message + " ]";
	}
}
