package com.cgt.catalogservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cgt.catalogservice.model.Movie;


@Component
// @FeignClient(name = "movie-service")
@FeignClient(name = "api-gateway")
@RibbonClient(name = "movie-service")
public interface MovieServiceProxy {

	@GetMapping("/movie-service/movies/{movieId}")
	public Movie getMovie(@PathVariable("movieId")Integer movieId);
}
