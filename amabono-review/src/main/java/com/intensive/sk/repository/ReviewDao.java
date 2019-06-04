package com.intensive.sk.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intensive.sk.entity.Review;

@Repository
public class ReviewDao {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	public List<Review> getReviews() {
		
		return reviewRepository.findAll();
	}
	
	public Review getReview(int id) {
		
		return reviewRepository.getOne(id);
	}
	
	public Review save(Review review) {
		return reviewRepository.save(review);
	}
	
	public Review modify(Review review) {
		return reviewRepository. ..save(review);
	}
	
	public String delete(int id) {
		reviewRepository.deleteById(id);
		return ""; 
	}
}
