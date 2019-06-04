package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Member;
import com.intensive.sk.entity.Status;
import com.intensive.sk.service.ActivityManagementService;

@RestController
public class ActivityManagementController {
	
	@Autowired
	private ActivityManagementService service;
	
	@GetMapping("/getActivityManagement")
	public ActivityManagement activityManagement(int id) {
		ActivityManagement result = service.getActivityManagement(id);
		
		return result;
	}
	
	@GetMapping("/getAllActivityManagements")
	public List<ActivityManagement> activityManagements(){
		List<ActivityManagement> results = service.getAllActivityManagements();
		
		return results;
	}
	
	@PostMapping("/apply")
	public void apply(long activityId, int memberId) {
		
		service.apply(memberId, activityId);
		
	}
	
	@PostMapping("/statusChange")
	public void statusChange(int id, Status status) {
		service.statusChange(id, status);
		
	}
	
	@GetMapping("/getActivity")
	public String getActivities(Long activityId){
		
		String results = service.getActivity(activityId);
		
		return results;
	}
	
	@GetMapping("/getMember")
	public String getMember(int memberId){
		
		String results = service.getMember(memberId);
		
		return results;
	}
}
