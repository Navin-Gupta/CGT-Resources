package com.cgt.training.classes;

/**
 * This is a sample class
 */


class Sample{
	
	/**
	 * 
	 * This is a public element
	 */
	public int a; // public / protected / private / default
	private int b;
	protected int c;
	int d;  //default
	
	static int s;
	
	public void fun() {
		
	}
	
	static void sfun() {
		
	}
	
	
	static {
		System.out.println("Inside static block!!!!");
		
	}
	
	Sample(){
		System.out.println("Inside constructor");
	}
	
	static {
		
	}
	
	// instance initializer block
	{
		System.out.println("Instance initializer block!!!");
	}
	
	{
		
	}
	
	
}


public class MyApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		/*System.out.println("Before ref");
		Sample S1;
		System.out.println("After ref");
		S1 = new Sample();
		System.out.println("After object");
		Sample S2 = new Sample();
		*/
		
		// Sample.sfun();
	
		Sample S1 = new Sample();
		// S1.
		Class.forName("com.cgt.training.classes.Sample");
		
	}

}
