package com.cgt.training.comparisions;

import java.util.Set;
import java.util.TreeSet;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> employees = new TreeSet<>();
		
		employees.add(new Employee(1, "First", "first@mail.com"));
		employees.add(new Employee(4, "Second", "second@mail.com"));
		employees.add(new Employee(5, "Third", "third@mail.com"));
		employees.add(new Employee(1, "Fourth", "fourth@mail.com"));
		employees.add(new Employee(2, "Fifth", "fifth@mail.com"));
		employees.add(new Employee(3, "Sixth", "sixth@mail.com"));
		
		System.out.println("SET : " + employees);
	}

}
