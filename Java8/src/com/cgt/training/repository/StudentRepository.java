package com.cgt.training.repository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("First", 2, 3.5));
		students.add(new Student("Second", 2, 3.9));
		students.add(new Student("Third", 3, 3.7));
		students.add(new Student("Fourth", 3, 4.0));
		students.add(new Student("Fifth", 4, 3.5));
		students.add(new Student("Sixt", 4, 3.8));
				
		return students;
	}
}
