package com.intensive.sk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityStatus;
import com.intensive.sk.service.ActivityService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActicityServiceTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	ActivityService activityService;
	
	@Test
	public void activityTest() {
		Activity activity2 = new Activity();
		activity2.setActivityId(Long.valueOf(19));
		activity2.setActivityStatus(ActivityStatus.APPLYING);
		activity2.setDetail("long long time");
		activityService.updateActivity(activity2);
		logger.info("{}",activity2.getActivityId());
		
	}
	
	

}
