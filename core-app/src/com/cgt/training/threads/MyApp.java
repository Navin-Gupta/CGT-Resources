package com.cgt.training.threads;

class MThread extends Thread{
	public void run() {
		for(int i = 0; i <1000; i++) {
			System.out.println("Thread : " + i);
		}
	}
}


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MThread thread = new MThread();
		thread.start();
		
		for(int i = 0; i <100; i++) {
			System.out.println("Main : " + i);
		}
		
		try {
			// thread.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Terminated");
	}

}
