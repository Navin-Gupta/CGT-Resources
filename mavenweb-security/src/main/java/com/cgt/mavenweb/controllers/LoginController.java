package com.cgt.mavenweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/custom-login")
	public String login() {
		return "custom-login";
	}
	
	@RequestMapping("/access-denied")
	public String accessDenied() {
		return "access-denied";
	}
}
