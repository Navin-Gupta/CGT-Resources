package com.cgt.mavenweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cgt.mavenweb.entity.Student;
import com.cgt.mavenweb.facade.StudentDao;


@Component
public class StudentDaoJdbcTemplateImpl implements StudentDao {

	
	private final String SQL_FETCHALL = "select * from student";
	private final String SQL_FETCH_BY_ID = "select * from student where id=?";
	// dependency
	private DataSource dataSource;
	
	private JdbcTemplate JdbcTemplate;
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = dataSource;
		this.JdbcTemplate = new JdbcTemplate();
		this.JdbcTemplate.setDataSource(this.dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students = this.JdbcTemplate.query(this.SQL_FETCHALL, new StudentRowMapper());
		return students;
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		Student student = null;
		try {
			student = this.JdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID, new Object[] {id}, new StudentRowMapper());
		}
		catch(Exception ex) {
			System.out.println("Student not found!!!");
		}
		return student;
	}

	@Override
	public boolean insert(Student student) {
		// TODO Auto-generated method stub
		this.JdbcTemplate.update("", new Object[] {});
		
		return true;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		this.JdbcTemplate.update("", new Object[] {});
		
		return true;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		this.JdbcTemplate.update("", new Object[] {});
		
		return true;
	}

}
