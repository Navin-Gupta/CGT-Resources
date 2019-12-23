package com.cgt.spring.mvc.controllers;

import java.util.LinkedHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgt.spring.mvc.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	private LinkedHashMap<String, String> countryOptions;
	
	@PostConstruct
	private void initCountryOptions() {
		this.countryOptions = new LinkedHashMap<>();
		this.countryOptions.put("IN", "INDIA");
		this.countryOptions.put("SG", "SINGAPORE");
		this.countryOptions.put("GE", "GERMANY");
		this.countryOptions.put("IT", "ITALY");
	}
	
	@RequestMapping("/entry")
	public String entry(Model model) {
		
		Student student = new Student();
		student.setEmail("dummy@mail.com");
		model.addAttribute("student", student);
		// model.addAttribute("countryOptions", this.countryOptions);
		return "student-entry";
	}
	
	@RequestMapping("/save-data")
	public String saveData(@ModelAttribute Student student) {
		
		return "student-show";
	}
}
