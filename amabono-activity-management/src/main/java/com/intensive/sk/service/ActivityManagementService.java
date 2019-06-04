package com.intensive.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Member;
import com.intensive.sk.entity.Status;
import com.intensive.sk.repository.ActivityManagementRepository;

@Service("activityManagementService")
public class ActivityManagementService {

	@Autowired
	private ActivityManagementRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String ACTIVITY_URL = "http://35.229.229.219:8080";
	private static final String MEMBER_URL = "http://35.201.143.36:8081";
	
	public void apply (int memberId, Long activityId) {
		
		ActivityManagement activityManagement = new ActivityManagement();
		String memberCheck = getMember(memberId);
		String activityCheck = getActivity(activityId);
		
		if(!memberCheck.isEmpty() && !activityCheck.isEmpty()) {
			activityManagement.setActivityId(activityId);
			activityManagement.setMemberId(memberId);
			activityManagement.setStatus(Status.APPLY);

			repository.save(activityManagement);
		}
	}
	
	public ActivityManagement getActivityManagement(int id) {
		
	 ActivityManagement am = repository.getOne(id);
	 
	 return am;
	}
	
	
	public void statusChange (int id, Status status) {
		
		
		ActivityManagement target = this.getActivityManagement(id);
		target.setStatus(status);
		
		repository.save(target);
		
	}
	
	public List<ActivityManagement> getAllActivityManagements (){
		
		
		return repository.findAll();
	}
	
	public String getActivity(Long activityId){
		
		Activity response = restTemplate.getForObject(ACTIVITY_URL + "/getActivity?id=" + activityId, Activity.class); 
//				restTemplate.exchange(ACTIVITY_URL + "/getAllActivities",HttpMethod.GET, null, new ParameterizedTypeReference<List<Activity>>(){}); 
//		List<Activity> results = response.getBody();

		return response.getName();
	}
	
	public String getMember(int memberId){
		
		Member response = restTemplate.getForObject(MEMBER_URL + "/member?id=" + memberId, Member.class);

		return response.getUsername();
	}
}
