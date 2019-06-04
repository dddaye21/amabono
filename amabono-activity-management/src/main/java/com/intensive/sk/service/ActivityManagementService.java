package com.intensive.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Member;
import com.intensive.sk.entity.Status;
import com.intensive.sk.repository.ActivityManagementRepository;

@Service("activityManagementService")
public class ActivityManagementService {

	@Autowired
	private ActivityManagementRepository repository;
	
	
	
	public void apply (Member member, Activity activity) {
		
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
}
