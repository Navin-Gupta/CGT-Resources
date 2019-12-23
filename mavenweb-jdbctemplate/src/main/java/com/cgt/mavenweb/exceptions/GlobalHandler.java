package com.cgt.mavenweb.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

	@ExceptionHandler
	public String handleStudentNotFoundException(StudentNotFoundException ex, Model model) {
		model.addAttribute("exception", ex);
		return "error-page";
	}
	
	@ExceptionHandler
	public String handleException(Exception ex, Model model) {
		model.addAttribute("exception", ex);
		return "error-page";
	}
}
