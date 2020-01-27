package com.cgt.boothibernate.bootstrap;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cgt.boothibernate.entity.Student;
import com.cgt.boothibernate.facade.StudentDao;

// Register this class as event handler (using interface Application Listener)
@Component
public class StudentBootstrap implements ApplicationListener<ContextRefreshedEvent>{ // which application to handle

	// dependency
	@Autowired
	private StudentDao studentDao;
	
	
	// dummy data
	List<Student> items = Arrays.asList(
			new Student(1, "First", "first@mail.com"),
			new Student(2, "Secondt", "second@mail.com"),
			new Student(3, "Third", "third@mail.com"),
			new Student(4, "Fourth", "fourth@mail.com")
					
			);
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		// logic to perform on that event...
		this.loadItemData();
		
	}
	
	private void loadItemData() {
		items.forEach(student -> this.studentDao.insert(student));
	}
	
	
	

}
