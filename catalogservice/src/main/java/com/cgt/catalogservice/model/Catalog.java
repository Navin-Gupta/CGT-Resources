package com.cgt.catalogservice.model;

public class Catalog {

	private String movieId;
	private String movieName;
	private String movieDesc;
	private int rating;
	
	
	
	public Catalog() {
		
	}
	
	public Catalog(String movieId, String movieName, String movieDesc, int rating) {
		
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDesc = movieDesc;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
