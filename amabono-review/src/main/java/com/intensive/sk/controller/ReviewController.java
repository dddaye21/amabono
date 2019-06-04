package com.intensive.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Review;
import com.intensive.sk.sevice.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;

	@PostMapping("/deleteReview")
	public void delete(Review review) {
		
	}
	
	@PostMapping("/modifyReview")
	public void modify(Review review) {
		
	}
	
	@PostMapping("/registerReview")
	public void register(Review review) {
		System.out.println(review);
		reviewService.createReview(review);
		
	}
	
	@GetMapping("/getReview")
	public Review review(int id) {
		Review result = new Review();
		
		return result;
	}
}
