package com.intensive.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Review;
import com.intensive.sk.entity.Score;
import com.intensive.sk.sevice.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;

	@PostMapping("/deleteReview")
	public void delete(Review review) {
		
		reviewService.deleteReview(review);
		
	}
	
	@PostMapping("/modifyReview")
	public void modify(Review review) {
		
		reviewService.modifyReview(review);
	}
	
	@PostMapping("/registerReview")
	public void register(int applManagementId, Score score, String contents) {
		Review review = new Review();
		review.setApplyManagementId(applManagementId);
		review.setScore(score);
		review.setContents(contents);
		reviewService.createReview(review);
		
	}
	
	@GetMapping("/getReview")
	public Review review(long id) {

		Review review = reviewService.getReviewByid(id);
		return review;
	}
	
	@GetMapping("/getAllReview")
	public List<Review> reviews(){
		
		return reviewService.getAllReview();
		
	}
}
