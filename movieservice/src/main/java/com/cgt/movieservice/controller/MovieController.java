package com.cgt.movieservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cgt.movieservice.model.Movie;

@RestController
public class MovieController {

	
	@GetMapping("/movies/{movieId}")
	public Movie getMovie(@PathVariable("movieId")Integer movieId) {
		// data can fetched from DAO impelementation
		
		Movie movie = new Movie("Movie" + movieId, "Some Dummy Movie","Action");
		return movie;
	}
}
