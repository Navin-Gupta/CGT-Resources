package com.cgt.spring.mvc.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String codePrefix;
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		this.codePrefix = constraintAnnotation.prefix();
	}
	@Override
	public boolean isValid(String actual, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return actual.startsWith(codePrefix);
	}

}
