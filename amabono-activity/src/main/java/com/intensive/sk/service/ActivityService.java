package com.intensive.sk.service;

import java.util.List;

import com.intensive.sk.entity.Activity;



public interface ActivityService {
	int deleteActivity(Long activityId);
	List <Activity> getActivityList();
	Activity getActivity(Long id);
	void updateActivity(Activity activity);
	void createActivity(Activity activity);
	Boolean isApplicable(Long activityId);	
	
	

}
