package com.cgt.boothibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cgt.boothibernate.dao.StudentDao;
import com.cgt.boothibernate.entity.Student;
import com.cgt.boothibernate.facade.StudentService;


// @Component
@Service
public class StudentServiceActualImpl implements StudentService {

	// dependency on DAO
	private StudentDao studentDao; // jpa repository
	
	@Autowired
	public StudentServiceActualImpl(StudentDao studentDao) {
		// TODO Auto-generated constructor stub
		this.studentDao = studentDao;
	}
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return this.studentDao.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> optional =  this.studentDao.findById(id);
		
		Student student = null;
		
		if(optional.isPresent())
			student = optional.get();
		return student;
	}

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.save(student);
		return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentDao.save(student);
		return true;
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		this.studentDao.deleteById(id);
		return true;
	}

}
