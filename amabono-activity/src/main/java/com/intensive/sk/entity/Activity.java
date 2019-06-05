package com.intensive.sk.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Activity  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long activityId;	
	private String name;
	
	@Column(columnDefinition ="LONGTEXT")
	private String detail;
	@Enumerated(EnumType.STRING)
	private ActivityStatus activityStatus;	
	@Enumerated(EnumType.STRING)
	private ActivityCategoryType activityCategoryType;
	private String applicationStartDate;
	private String applicationEndDate;
	private String serviceStartDate;
	private String serviceEndDate;
	
	public Activity() {
		
		
	}



	public Activity( String name, String detail, ActivityStatus activityStatus,
			ActivityCategoryType activityCategoryType, String applicationStartDate, String applicationEndDate,
			String serviceStartDate, String serviceEndDate) {
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
