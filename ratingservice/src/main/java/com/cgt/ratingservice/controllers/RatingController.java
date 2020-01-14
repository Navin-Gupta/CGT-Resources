package com.cgt.ratingservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cgt.ratingservice.model.Rating;
import com.cgt.ratingservice.model.UserRating;

@RestController
public class RatingController {

	@GetMapping("/ratings/{userId}")
	public UserRating getRatings(@PathVariable("userId")Integer userId) {
		
		List<Rating> ratings = new ArrayList<Rating>();
		ratings.add(new Rating(1, 3));
		ratings.add(new Rating(2, 4));
		ratings.add(new Rating(3, 2));
		ratings.add(new Rating(4, 3));
		ratings.add(new Rating(5, 4));
		
		UserRating userRating = new UserRating(userId, ratings);
		
		return userRating;
	}
}
