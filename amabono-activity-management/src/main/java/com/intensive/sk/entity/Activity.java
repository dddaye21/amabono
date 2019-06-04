package com.intensive.sk.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Activity  {
	
	private Long activityId;	
	private String name;
	
	private String detail;
	private ActivityStatus activityStatus;	
	private ActivityCategoryType activityCategoryType;
	private LocalDate applicationStartDate;
	private LocalDate applicationEndDate;
	private LocalDate serviceStartDate;
	private LocalDate serviceEndDate;
	
	public Activity() {
		
		
	}


	public Activity( String name, String detail, ActivityStatus activityStatus,
			ActivityCategoryType activityCategoryType, LocalDate applicationStartDate, LocalDate applicationEndDate,
			LocalDate serviceStartDate, LocalDate serviceEndDate) {
		super();
		this.name = name;
		this.detail = detail;
		this.activityStatus = activityStatus;
		this.activityCategoryType = activityCategoryType;
		this.applicationStartDate = applicationStartDate;
		this.applicationEndDate = applicationEndDate;
		this.serviceStartDate = serviceStartDate;
		this.serviceEndDate = serviceEndDate;
	}
	
	


	
	

}
