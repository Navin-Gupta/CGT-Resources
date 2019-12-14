package com.cgt.training.lambdas;


class Sample{
	/*void conveyMessage(String msg) {
		System.out.println("Message : " + msg);
	}*/
	
	void conveyMessage(Greetings gretings, String msg) {
		gretings.sendGreeting(msg);
	}
}

public class MyApp {

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
		
	}

}
