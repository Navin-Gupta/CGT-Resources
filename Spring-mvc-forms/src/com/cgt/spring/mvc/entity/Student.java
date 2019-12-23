package com.cgt.spring.mvc.entity;

import java.util.LinkedHashMap;

public class Student {

	private String name;
	private String email;
	private String country;
	
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
