package com.cgt.catalogservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cgt.catalogservice.model.UserRating;


@Component
// @FeignClient(name = "rating-service")
@FeignClient(name = "api-gateway")
@RibbonClient(name = "rating-service")
public interface RatingServiceProxy {
	@GetMapping("/rating-service/ratings/{userId}")
	public UserRating getRatings(@PathVariable("userId")Integer userId);
	
}
