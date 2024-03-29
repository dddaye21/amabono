package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.service.ActivityService;

@RestController
public class ActivityController {
	
	@Autowired
	ActivityService activityService;

	@GetMapping("/getAllActivities")
	public List<Activity> activities(){
		List<Activity> results = activityService.getActivityList();
		
		return results;
	}
	
	@GetMapping("/getActivity")
	public Activity activity(Long id) {
		Activity result = activityService.getActivity(id);
		
		return result;
	}
	
	@GetMapping("/isApplicable")
	public Boolean isApplicable(Long activityId) {
		return activityService.isApplicable(activityId);
	}
	
	@PostMapping("/deleteActivity")
	public void delete(Long id) {
		activityService.deleteActivity(id);
		
		
	}
	
	@PostMapping("/modifyActivity")
	public void modify(Activity activity) {
		activityService.updateActivity(activity);
		
	}
	
	@PostMapping("/registerActivity")
	public void register(Activity activity) {
		
		activityService.createActivity(activity);
		
	}
}
