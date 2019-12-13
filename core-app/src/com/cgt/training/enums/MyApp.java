package com.cgt.training.enums;


// enum 

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days day = Days.MONDAY;
		System.out.println(day);
		// day.getWorkingHrs();
		System.out.println("THURSDAY : " + Days.THURSDAY.getWorkingHrs());
		System.out.println("SUNDAY : " + Days.SUNDAY.getWorkingHrs());
	}

	
	// Theater.PLATINUM.getRate(Days.SATURDAY);
}
