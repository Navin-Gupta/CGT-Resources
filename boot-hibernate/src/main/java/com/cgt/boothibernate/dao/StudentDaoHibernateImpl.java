package com.cgt.boothibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

// import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cgt.boothibernate.entity.Student;
import com.cgt.boothibernate.facade.StudentDao;




// @Component
@Repository
public class StudentDaoHibernateImpl implements StudentDao {

	// dependency 
	// private SessionFactory sessionFactory;
	private EntityManager entityManager;
	
	@Autowired
	public StudentDaoHibernateImpl(EntityManager entityManager) {
		// TODO Auto-generated constructor stub
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		// Session session = this.sessionFactory.getCurrentSession();
		Session session = this.entityManager.unwrap(Session.class);
		Query<Student> query =  session.createQuery("from Student", Student.class);
		
		// query.executeUpdate();
		List<Student> students = query.getResultList();
		return students;
	}

	@Override
	@Transactional
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		// Session session = this.sessionFactory.getCurrentSession();
		Session session = this.entityManager.unwrap(Session.class);
		Student student = session.get(Student.class, id);
		
		return student;
	}

	@Override
	@Transactional
	public boolean insert(Student student) {
		// TODO Auto-generated method stub
		// Session session = this.sessionFactory.getCurrentSession();
		Session session = this.entityManager.unwrap(Session.class);
		session.save(student);
		return true;
	}

	@Override
	@Transactional
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		// Session session = this.sessionFactory.getCurrentSession();
		Session session = this.entityManager.unwrap(Session.class);
		session.update(student);
		return true;
	}

	@Override
	@Transactional
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		// Session session = this.sessionFactory.getCurrentSession();
		Session session = this.entityManager.unwrap(Session.class);
	 	/*Query query = session.createQuery("delete from Student where id:=" + id);
	 	query.executeUpdate();*/
		session.delete(this.findById(id));
		return true;
	}

}
