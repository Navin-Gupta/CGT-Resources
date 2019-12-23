package com.cgt.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrialController {

	@RequestMapping("/test")
	public String test() {
		// put your logic
		return "test-page";
	}
	
}
