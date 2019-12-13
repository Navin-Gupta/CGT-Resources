package com.cgt.training.enums;

public enum Days {

	MONDAY,  // object of class Days
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	private int workingHrs;
	
	public int getWorkingHrs() {
		this.workingHrs = 8;
		switch(this) {
		case MONDAY : 
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY: return this.workingHrs;
		case FRIDAY : return this.workingHrs - 3;
		}
		return 0;
	}
	
	
	/*static {
		MONDAY = new Days();
	}*/
}
