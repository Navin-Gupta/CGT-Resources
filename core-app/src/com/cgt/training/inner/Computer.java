package com.cgt.training.inner;

public class Computer {

	private String contents;
	
	class CPU{
		void process(String data) {
			// System.out.println("Processing..");
			contents = data;
			// this$0.contents = data
		}
	}
	public class Monitor{
		void display() {
			// System.out.println("Generating output");
			System.out.println(contents);
		}
	}
	
	static class DataCable{
		
	}
	
	private class MotherBoard{
		
	}
	
	// anonymous inner classes
}
