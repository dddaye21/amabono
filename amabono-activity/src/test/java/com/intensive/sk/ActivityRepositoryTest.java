package com.intensive.sk;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityCategoryType;
import com.intensive.sk.entity.ActivityStatus;
import com.intensive.sk.entity.ApplicationPeriod;
import com.intensive.sk.entity.ServicePeriod;
import com.intensive.sk.repository.ActivityRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityRepositoryTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ActivityRepository activityRepository;
	
	@Test
	public void activityTest(){
		
		String desc ="We have over 10 years of experience in organizing medical electives abroad for medical students and nursing students, as well as medical mission trips for qualified healthcare practitioners. If you’re an aspiring medical professional, we also offer medical volunteer opportunities abroad for pre med, pre health and pre nursing students";
		
		Activity activity1 = new Activity("name1", desc, ActivityStatus.TEMP_SAVED,
				ActivityCategoryType.MED_HEALTH, new ApplicationPeriod(LocalDate.of(2019,6,1),LocalDate.of(2019,6,30)) ,
				new ServicePeriod(LocalDate.of(2019,7,1),LocalDate.of(2019,8,31)) );
		activity1=activityRepository.save(activity1);
		
		Optional <Activity> activityResult = activityRepository.findById(activity1.getActivityId());
		Assert.assertNotNull(activityResult.get().getName());
		Assert.assertNotNull(activityResult.get().getDetail());
		logger.debug("{}",activityResult.get().toString());
		
		
		
		
	}

}
