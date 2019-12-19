package com.cgt.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value= {"/home", "/index"})
	public String index() {
		return "student-home";
	}
	
	@RequestMapping()
	public String defaultResponse() {
		return "student-default";
	}
	
	@RequestMapping("*")
	public String fallback() {
		return "fallback";
	}
	
	/*@RequestMapping("/request-data")
	public String requestData(HttpServletRequest request) {
		String type = request.getParameter("type");
		System.out.println("Reieved data : " + type);
		return "student-request-data";
	}*/
	
	
	@RequestMapping("/request-data")
	public String requestData(@RequestParam("test") String type) {
		System.out.println("Data : " + type);
		return "student-request-data";
	}
	
	// @RequestMapping("/request-data-pro/{type}/data/{id}")
	@RequestMapping("/request-data-pro/{type}")
	// public String requestDataPro(@PathVariable String type) {
	public String requestDataPro(@PathVariable("type") String test) {
		System.out.println("Path Variable : " + test);
		return "student-request-data";
	}
}
