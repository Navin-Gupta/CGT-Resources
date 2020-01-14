package com.cgt.catalogservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cgt.catalogservice.model.Catalog;
import com.cgt.catalogservice.model.Movie;
import com.cgt.catalogservice.model.Rating;
import com.cgt.catalogservice.model.UserRating;

@RestController
public class CatalogController {

	// add dependency
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/catalog/{userId}")
	public List<Catalog> getCatalog() {
		
		List<Catalog> catalogs = new ArrayList<Catalog>();
		
		// 1. call Rating Microservice to get movieid and rating
		// UserRating userRating = this.restTemplate.getForObject("http://localhost:7071/ratings/1", UserRating.class);
		
		UserRating userRating = this.restTemplate.getForObject("http://rating-service/ratings/1", UserRating.class);
		
		// 2. call Movie Microservice to get movieDesc
		for(Rating rating : userRating.getRatings()) {
			int id = rating.getMovieId();
			// Movie movie = this.restTemplate.getForObject("http://localhost:9091/movies/" + id, Movie.class);
			Movie movie = this.restTemplate.getForObject("http://movie-service/movies/" + id, Movie.class);
			Catalog catalog = new Catalog(movie.getMovieId(),movie.getMovieName(),movie.getMovieDesc(), rating.getRating());
			catalogs.add(catalog);
		}
		
		return catalogs;
		
	}
}
