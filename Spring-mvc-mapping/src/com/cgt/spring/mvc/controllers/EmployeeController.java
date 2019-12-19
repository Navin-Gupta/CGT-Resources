package com.cgt.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/home")
	public String index() {
		return "employee-home";
	}
}
