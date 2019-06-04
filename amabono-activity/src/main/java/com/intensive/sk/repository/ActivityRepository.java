package com.intensive.sk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.intensive.sk.entity.Activity;
import com.intensive.sk.entity.ActivityCategoryType;


public interface ActivityRepository extends PagingAndSortingRepository<Activity, Long> {


	List <Activity> findByNameContaining(String name);
	Optional <Activity> findByActivityCategoryType(@Param("activityCategoryType") ActivityCategoryType activityCategoryType);

}