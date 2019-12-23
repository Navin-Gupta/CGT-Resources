package com.cgt.spring.mvc.entity;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cgt.spring.mvc.constraint.CourseCode;



public class Student {

	@NotNull(message = "Name not provided!!!" )
	// @Size(min = 1, max = 10, message = "Name not given!!!")
	// @NotBlank(message = "Name not available")
	private String name;
	
	private String email;
	private String country;
	
	@NotNull(message = "Free passes count not provided!")
	// private int freePasses;
	private Integer freePasses;
	
	// @CourseCode(prefix = "CGT", message = "Course Code Invalid!!!")
	@CourseCode
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public Integer getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	private LinkedHashMap<String, String> countryOptions;
	private String[] favoriteLanguages;
	
	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}


	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}


	public Student() {
		// TODO Auto-generated constructor stub
		// populate countryOption
		this.countryOptions = new LinkedHashMap<>();
		this.countryOptions.put("IN", "INDIA");
		this.countryOptions.put("SG", "SINGAPORE");
		this.countryOptions.put("GE", "GERMANY");
		this.countryOptions.put("IT", "ITALY");
		
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
