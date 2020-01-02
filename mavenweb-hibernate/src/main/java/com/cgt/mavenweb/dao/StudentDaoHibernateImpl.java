package com.cgt.mavenweb.dao;

import java.util.List;

import javax.transaction.Transactional;

// import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cgt.mavenweb.entity.Student;
import com.cgt.mavenweb.facade.StudentDao;


// @Component
@Repository
public class StudentDaoHibernateImpl implements StudentDao {

	// dependency 
	private SessionFactory sessionFactory;
	
	@Autowired
	public StudentDaoHibernateImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query<Student> query =  session.createQuery("from Student", Student.class);
		
		// query.executeUpdate();
		List<Student> students = query.getResultList();
		return students;
	}

	@Override
	@Transactional
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		
		return student;
	}

	@Override
	@Transactional
	public boolean insert(Student student) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(student);
		return true;
	}

	@Override
	@Transactional
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(student);
		return true;
	}

	@Override
	@Transactional
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
	 	/*Query query = session.createQuery("delete from Student where id:=" + id);
	 	query.executeUpdate();*/
		session.delete(this.findById(id));
		return true;
	}

}
