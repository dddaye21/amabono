package com.intensive.sk.sevice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Review;
import com.intensive.sk.repository.ReviewRepository;

@Service("reviewService")
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.path}")
	private String URL;
	
	public void createReview(Review review) {
		
		ActivityManagement activityInfo = this.getActivityDetail(review.getApplyManagementId());
		Review target = review ;
		target.setApplyManagementId(review.getApplyManagementId());
		target.setActivityName(activityInfo.getActivityName());
		target.setMemberName(activityInfo.getMemberName());
		
		
		
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
	
	public ActivityManagement getActivityDetail (int manageId) {
		
		ActivityManagement response = restTemplate.getForObject(URL + "/activity-management" + "/getActivityManagement?id=" + manageId, ActivityManagement.class );
	
	 	return response;
	}
	
	

	
}
