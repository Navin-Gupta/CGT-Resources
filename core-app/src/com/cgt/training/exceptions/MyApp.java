package com.cgt.training.exceptions;

public class MyApp {

	
	public static void fun() {
		
		int a, b, c;
		int [] arr;
		a = 10;
		b = 2;
		arr= new int [5];
		try {
			System.out.println("Before evaluation");
			
			if(b==2)
				return;
			c = a/b;
			
			arr[8]= 20;
			
			System.out.println("After evaluation");
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmatic problem handled");
		}
		/*catch(ArrayIndexOutOfBoundsException aob) {
			System.out.println("Array problem handled");
		}
		catch(Exception ex) {
			System.out.println("General problem handled");
		}*/
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("After everything");
		// arr = new int [10];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try {
			fun();
		// }
		/*catch(ArrayIndexOutOfBoundsException aob) {
			System.out.println("Array problem handled in main");
		}*/
		System.out.println("BAck to main");
	}

}
