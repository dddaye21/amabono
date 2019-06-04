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
public class Activity extends BaseEntity {
	
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
	private ApplicationPeriod applicationPeriod;
	private ServicePeriod servicePeriod;
	
	public Activity(String name) {
		this.name = name;
	}

	public Activity(String name, String detail, ActivityStatus activityStatus,
			ActivityCategoryType activityCategoryType, ApplicationPeriod applicationPeriod,
			ServicePeriod servicePeriod) {
		super();
		
		this.name = name;
		this.detail = detail;
		this.activityStatus = activityStatus;
		this.activityCategoryType = activityCategoryType;
		this.applicationPeriod = applicationPeriod;
		this.servicePeriod = servicePeriod;
	}
	
	

}
