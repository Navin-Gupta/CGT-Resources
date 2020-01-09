package com.cgt.boothibernate.facade;

import java.util.List;

import com.cgt.boothibernate.entity.Student;


public interface StudentDao {

	List<Student> findAll();
	Student findById(Integer id);
	boolean insert(Student student);
	boolean update(Student student);
	boolean delete(Integer id);
}
