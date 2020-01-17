package com.cgt.catalogservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cgt.catalogservice.model.UserRating;


@Component
@FeignClient(name = "rating-service")
@RibbonClient(name = "rating-service")
public interface RatingServiceProxy {
	@GetMapping("/ratings/{userId}")
	public UserRating getRatings(@PathVariable("userId")Integer userId);
	
}
