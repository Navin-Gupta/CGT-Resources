package com.cgt.training.lambdas;

public class SmsGreeting implements Greetings {

	@Override
	public void sendGreeting(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sent on SMS : " + msg);
	}
	

}
