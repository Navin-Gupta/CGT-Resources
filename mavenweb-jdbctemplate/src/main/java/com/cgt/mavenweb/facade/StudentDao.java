package com.cgt.mavenweb.facade;

import java.util.List;

import com.cgt.mavenweb.entity.Student;

public interface StudentDao {

	List<Student> findAll();
	Student findById(Integer id);
	boolean insert(Student student);
	boolean update(Student student);
	boolean delete(Integer id);
}
