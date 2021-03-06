package com.cgt.mavenweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cgt.mavenweb.entity.Student;
import com.cgt.mavenweb.facade.StudentDao;
import com.cgt.mavenweb.facade.StudentService;

@Component
public class StudentServiceActualImpl implements StudentService {

	// dependency on DAO
	private StudentDao studentDao;
	
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
		return this.studentDao.findById(id);
	}

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.insert(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.update(student);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.delete(id);
	}

}
