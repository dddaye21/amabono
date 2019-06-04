package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Member;
import com.intensive.sk.entity.Status;

@RestController
public class ActivityManagementController {
	
	@GetMapping("/getActivityManagement")
	public ActivityManagement activityManagement(int id) {
		ActivityManagement result = new ActivityManagement();
		
		return result;
	}
	
	@GetMapping("/getAllActivityManagements")
	public List<ActivityManagement> activityManagements(){
		List<ActivityManagement> results = new ArrayList<>();
		
		return results;
	}
	
	@PostMapping("/apply")
	public void apply(Activity activity, Member member) {
		
	}
	
	@PostMapping("/statusChange")
	public void statusChange(int id, Status status) {
		
	}
}
