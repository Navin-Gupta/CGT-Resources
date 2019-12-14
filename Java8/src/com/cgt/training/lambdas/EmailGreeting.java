package com.cgt.training.lambdas;

public class EmailGreeting implements Greetings{

	@Override
	public void sendGreeting(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sent on Email : " + msg);
	}

}
