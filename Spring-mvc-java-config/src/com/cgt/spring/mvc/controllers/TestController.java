package com.cgt.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home() {
		// put your logic
		return "main-menu";
	}
	
	/*@RequestMapping("/test")
	public String test() {
		// put your logic
		return "main-menu";
	}*/
	
}
