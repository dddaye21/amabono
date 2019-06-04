package com.intensive.sk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Review;

@RestController
public class ReviewController {

	@PostMapping("/deleteReview")
	public void delete(Review review) {
		
	}
	
	@PostMapping("/modifyReview")
	public void modify(Review review) {
		
	}
	
	@PostMapping("/registerReview")
	public void register(Review review) {
		
	}
	
	@GetMapping("/getReview")
	public Review review(int id) {
		Review result = new Review();
		
		return result;
	}
}
