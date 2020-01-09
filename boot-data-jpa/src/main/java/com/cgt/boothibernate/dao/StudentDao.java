package com.cgt.boothibernate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cgt.boothibernate.entity.Student;

// entity class name
// datatype of Id (primary key)
public interface StudentDao extends JpaRepository<Student, Integer> {

	// no method!!!
	List<Student> findByEmail(String email);
	
	@Query("select s from Student s where s.email=:email and name Like :name")
	List<Student> findStudentRecordsByEmail(@Param("email")String email,@Param("name")String name);
	
}
