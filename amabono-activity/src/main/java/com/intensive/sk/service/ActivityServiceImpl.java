package com.intensive.sk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityStatus;
import com.intensive.sk.repository.ActivityRepository;



@Service
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	ActivityRepository activityRepository;
	
	public int deleteActivity(Long activityId) {		

		Optional <Activity> activityResult = activityRepository.findById(activityId);
		if(activityResult.isPresent()) {
			Activity activity = activityResult.get();
			//임시저장 상태의 활동만 삭제 가능
			if(activity.getActivityStatus() == ActivityStatus.TEMP_SAVED) {
				activityRepository.deleteById(activityId);
				return 0;
			}else 
				return -1;
			
		}else 
			return -1;
		
		
	};
	
	public List <Activity> getActivityList(){
		Iterable <Activity> activities = activityRepository.findAll();
		List <Activity> myList = Lists.newArrayList(activities);
		return myList;
		
	}
	
	public Activity getActivity(Long id) {
		Optional <Activity> activityResult = activityRepository.findById(id);
		if(activityResult.isPresent()) {
			return activityResult.get();
		}else return null;
		
	}
	public void updateActivity(Activity activity) {
		
	}

}
