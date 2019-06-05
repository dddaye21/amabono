package com.intensive.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${api.path}")	
	private String URL;
	
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
		
		Activity response = restTemplate.getForObject(URL +"/activity"+ "/getActivity?id=" + activityId, Activity.class); 

		return response.getName();
	}
	
	public String getMember(int memberId){
		
		Member response = restTemplate.getForObject(URL +"/member" + "/member?id=" + memberId, Member.class);

		return response.getUsername();
	}
}
