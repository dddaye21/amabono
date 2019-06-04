package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Activity;

@RestController
public class ActivityController {

	@GetMapping("/getAllActivities")
	public List<Activity> activities(){
		List<Activity> results = new ArrayList<>();
		
		return results;
	}
	
	@GetMapping("/getActivity")
	public Activity activity(int id) {
		Activity result = new Activity();
		
		return result;
	}
	
	@PostMapping("/deleteActivity")
	public void delete(Activity activity) {
		
	}
	
	@PostMapping("/modifyActivity")
	public void modify(Activity activity) {
		
	}
	
	@PostMapping("/registerActivity")
	public void register(Activity activity) {
		
	}
}
