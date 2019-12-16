package com.cgt.training.lambdas;

import java.util.function.Consumer;


class Sample{
	/*void conveyMessage(String msg) {
		System.out.println("Message : " + msg);
	}*/
	
	void conveyMessage(Greetings gretings, String msg) {
		gretings.sendGreeting(msg);
	}
}

public class MyApp {
	// public Greetings ref = msg -> System.out.println("Sent for broadcast : " + msg);
	
	
	public static void fun(String msg) {
		System.out.println("Testing : " + msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		// obj.conveyMessage("Hello All");
		//EmailGreeting email = new EmailGreeting();
		//obj.conveyMessage(email, "Hello All");
		
		// obj.conveyMessage(new SmsGreeting(), "Hello All");
		
		/*obj.conveyMessage(new Greetings() {
			
			@Override
			public void sendGreeting(String msg) {
				// TODO Auto-generated method stub
				System.out.println("Sent on Twitter : " + msg);
			}
		}, "Hello All");
		
		obj.conveyMessage(new Greetings() {
			
			@Override
			public void sendGreeting(String msg) {
				// TODO Auto-generated method stub
				System.out.println("Sent on Facebook : " + msg);
			}
		}, "Hello All");*/
		
		// obj.conveyMessage(msg -> System.out.println("Sent for broadcast : " + msg) ,"Hello All");
		// obj.conveyMessage(System.out::println ,"Hello All");
		
		
		
		// Greetings ref = new EmailGreeting();
		
		// functional interface ref can refer to lanbda expression
		// Greetings ref = msg -> System.out.println("Sent for broadcast : " + msg);
		
		// obj.conveyMessage(ref, "Hello All");
		
		Greetings ref = MyApp :: fun;
		obj.conveyMessage(ref, "Hello All");
		obj.conveyMessage(MyApp :: fun, "Hello All");
		
		// Consumer<String> consumer;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
