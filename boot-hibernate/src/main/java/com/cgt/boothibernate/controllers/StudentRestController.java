package com.cgt.boothibernate.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgt.boothibernate.entity.Student;
import com.cgt.boothibernate.exceptions.StudentErrorResponse;
import com.cgt.boothibernate.exceptions.StudentNotFoundException;
import com.cgt.boothibernate.facade.StudentService;


@RestController
@RequestMapping("/api")
public class StudentRestController {

	// dependency
		@Autowired
		private StudentService service;
		
		@GetMapping("/students")
		public ResponseEntity<List<Student>> allStudents() {
			List<Student> students = this.service.getAllStudents();
			ResponseEntity<List<Student>> responseEntity = new ResponseEntity<List<Student>>(students,  HttpStatus.OK);
			return responseEntity;
			/*Map<String, List<String>> headers = new HashMap<>(); 
			List<String> header1 = new ArrayList<String>();
			header1.add("application/json");
			headers.put("content-type", header1);
			//  add more headers
			ResponseEntity<List<Student>> responseEntity = new ResponseEntity<List<Student>>(students, (MultiValueMap<String, String>) headers, HttpStatus.OK);
			return responseEntity;*/
		}
		
		@GetMapping("/students/{studentId}")
		public Student getStudentById(@PathVariable Integer studentId) {
			Student student =  this.service.getStudentById(studentId);
			if(student == null)
				throw new StudentNotFoundException("Student with Id - " + studentId + " not found!!!");
			return student;
		}
		
		@PostMapping("/students")
		public Student addStudent(@RequestBody Student student) {
			this.service.insertStudent(student);
			return student;
		}
		
		@PutMapping("/students")
		public Student updateStudent(@RequestBody Student student) {
			this.service.updateStudent(student);
			return student;
		}
		
		@DeleteMapping("/students/{studentId}")
		public Student deleteStudent(@PathVariable Integer studentId) {
			Student student = this.service.getStudentById(studentId);
			if(student == null)
				throw new StudentNotFoundException("Student with Id - " + studentId + " not found!!!");
			this.service.deleteStudent(studentId);
			return student;
		}
		
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handler(StudentNotFoundException ex) {
			StudentErrorResponse error = new StudentErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
			ResponseEntity<StudentErrorResponse> responseEntity = new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND); 
			return responseEntity;
		}
		
		
}
