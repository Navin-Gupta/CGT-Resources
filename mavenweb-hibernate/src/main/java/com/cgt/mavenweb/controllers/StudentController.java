package com.cgt.mavenweb.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgt.mavenweb.entity.Student;
import com.cgt.mavenweb.exceptions.StudentNotFoundException;
import com.cgt.mavenweb.facade.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	// dependency
	@Autowired
	private StudentService service;
	
	@GetMapping("/all")
	public String home(Model model) {
		List<Student> students = this.service.getAllStudents();
		
		model.addAttribute("students", students);
		return "student-list";
	}
	
	@GetMapping("/get/{studentId}")
	public String getStudent(@PathVariable Integer studentId, Model model, HttpServletRequest request) {
		
		Student student = this.service.getStudentById(studentId);
		
		
		// manage session
		/*HttpSession session = request.getSession();
		session.setAttribute("", "");
		long creationTime = session.getCreationTime();
		session.invalidate();// logout
		session.isNew();*/
		
		
		if(student == null)
			throw new RuntimeException("Student with Id - " + studentId + " not found(General)!!!");
			// throw new StudentNotFoundException("Student with Id - " + studentId + " not found!!!");
		model.addAttribute("student", student);
		return "student-show";
	}
	
	/*@ExceptionHandler
	public String handleStudentNotFoundException(StudentNotFoundException ex, Model model) {
		model.addAttribute("exception", ex);
		return "error-page";
	}
	
	@ExceptionHandler
	public String handleException(Exception ex, Model model) {
		model.addAttribute("exception", ex);
		return "error-page";
	}*/
}


















