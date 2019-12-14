package com.cgt.training.comparisions;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyAppPro {
	
	static class MyComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
			return student1.getId() - student2.getId();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparator myComparator = new MyComparator();
		
		
		
		
		Set<Student> students = new TreeSet<>(myComparator);
		
		students.add(new Student(1, "First", "first@mail.com"));
		students.add(new Student(4, "Second", "second@mail.com"));
		students.add(new Student(5, "Third", "third@mail.com"));
		students.add(new Student(1, "Fourth", "fourth@mail.com"));
		students.add(new Student(2, "Fifth", "fifth@mail.com"));
		students.add(new Student(3, "Sixth", "sixth@mail.com"));
		
		System.out.println("SET : " + students);
	}

}
