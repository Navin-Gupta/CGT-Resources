package com.cgt.training.inner;


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer C1 = new Computer();
		Computer C2 = new Computer();

		Computer.CPU cpu1 = C1.new CPU();
		cpu1.process("Hello");
		
		Computer.CPU cpu2 = C2.new CPU();
		cpu2.process("Bye");
		
		Computer.Monitor mn1 = C1.new Monitor();
		Computer.Monitor mn2 = C2.new Monitor();
		
		mn1.display();
		mn2.display();
		
		Computer.Monitor mn11 = C1.new Monitor();
		// Computer$Monitor mn11 = new Computer$Monitor(C1);
		mn11.display();
	}

}
