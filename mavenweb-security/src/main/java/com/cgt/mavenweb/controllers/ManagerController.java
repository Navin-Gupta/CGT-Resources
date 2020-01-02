package com.cgt.mavenweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@RequestMapping("/home")
	public String home() {
		return "manager-home";
	}
}
