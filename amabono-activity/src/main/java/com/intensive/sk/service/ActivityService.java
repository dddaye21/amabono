package com.intensive.sk.service;

import java.util.List;

import com.intensive.sk.entity.Activity;



public interface ActivityService {
	int deleteActivity(Long activityId);
	List <Activity> getActivityList();
	Activity getActivity(Long id);
	
	
	

}
