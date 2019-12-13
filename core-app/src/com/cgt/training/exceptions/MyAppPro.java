package com.cgt.training.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyAppPro {

	public static void ageInput() throws AgeException{
		int age = 0;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter age  :");
			age = scan.nextInt();
			if(age < 20 || age >60)
				throw new AgeException();
			System.out.println("Age entered successfully");
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid data!!!");
		}
		/*catch(AgeException ae) {
			System.out.println("Invalid age!!!");
		}*/
	} 
	public static void main(String[] args) throws AgeException{
		// TODO Auto-generated method stub
		ageInput();
		
	}

}
