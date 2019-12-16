package com.cgt.training.repository;

public class Student {

	private String name;
	private int grade;
	private double gpa;
	
	
	
	
	
	public Student(String name, int grade, double gpa) {
		// super();
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	
	public Student() {}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gpa=" + gpa + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
