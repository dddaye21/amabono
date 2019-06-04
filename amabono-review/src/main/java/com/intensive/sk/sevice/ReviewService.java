package com.intensive.sk.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensive.sk.entity.Review;
import com.intensive.sk.repository.ReviewRepository;

@Service("reviewService")
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	public void createReview(Review review) {
		
		reviewRepository.save(review);
		
	}
	
	public Review getReviewByid(long id) {
		
		Review review = reviewRepository.findById(id);		
		return review;
	}
	
	public void deleteReview(Review review) {
		
		Review target = reviewRepository.findById(review.getId());
		reviewRepository.delete(target);
	}
	
	
	public List<Review> getAllReview(){
		
		return (List<Review>) reviewRepository.findAll();
	}
	
	public void modifyReview(Review review) {
		
		Review target = reviewRepository.findById(review.getId());
		target.setContents(review.getContents());
		target.setScore(review.getScore());
		reviewRepository.save(target);
	}
	
	

	
}
