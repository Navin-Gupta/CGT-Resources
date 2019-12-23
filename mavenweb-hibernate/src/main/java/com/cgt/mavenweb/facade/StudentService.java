package com.cgt.mavenweb.facade;

import java.util.List;

import com.cgt.mavenweb.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student getStudentById(Integer id);
	boolean insertStudent(Student student);
	boolean updateStudent(Student student);
	boolean deleteStudent(Integer id);
}
