package com.cgt.spring.mvc.constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String prefix() default "CGT";
	public String message() default "Course Code shall begin with CGT";
	
	
	// returns an array of class reflection
	public Class<?>[] groups() default {}; // to group the related constraints
	
	// provide custom details about validation failures(severity level, error code)
	public Class<? extends Payload>[]  payload() default{};


}
