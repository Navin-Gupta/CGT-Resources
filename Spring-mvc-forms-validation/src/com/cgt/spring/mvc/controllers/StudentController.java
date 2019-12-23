package com.cgt.spring.mvc.controllers;

import java.util.LinkedHashMap;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String saveData(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		System.out.println(result.hasErrors());
		if(result.hasErrors()) {
			return "student-entry";
		}
		return "student-show";
	}
	
	@InitBinder
	public void interceptRequest(WebDataBinder binder) {
		
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}
}
