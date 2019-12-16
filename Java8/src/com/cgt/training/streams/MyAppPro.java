package com.cgt.training.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.cgt.training.repository.Student;
import com.cgt.training.repository.StudentRepository;

public class MyAppPro {

	static List<Student> students;
	
	static Supplier<List<Student>> studentSupplier = () -> StudentRepository.getStudents();
	
	static Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.5;
	static Predicate<Student> gradePredicate = student -> student.getGrade() > 2;
	static Predicate<String> lenPredicate = name -> name.length() < 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students = studentSupplier.get();
		
		List<String> names = students.stream() // Stream<Student>
				.filter(gpaPredicate) // Stream<Student>
				.filter(gradePredicate) // Stream<Student>
				.map(student -> student.getName()) // Stream<String>
				.filter(lenPredicate)
				.collect(Collectors.toList());
		
		names.forEach(System.out:: println);
	}

}
