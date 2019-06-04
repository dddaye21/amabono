package com.intensive.sk.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private int id;
	private String name;
	private ActivityStatus status;
	private String detail;
	private Date activityStartDate;
	private Date activityEndDate;
	private Date applicationStartDate;
	private Date applicationEndDate;
	private ActivityCategory activityCategory;
	
	public Member() {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.detail = detail;
		this.activityStartDate = activityStartDate;
		this.activityEndDate = activityEndDate;
		this.applicationStartDate = applicationStartDate;
		this.applicationEndDate = applicationEndDate;
		this.activityCategory = activityCategory;
	}

	
	public Member(int id, String name, ActivityStatus status, String detail, Date activityStartDate,
			Date activityEndDate, Date applicationStartDate, Date applicationEndDate,
			ActivityCategory activityCategory) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.detail = detail;
		this.activityStartDate = activityStartDate;
		this.activityEndDate = activityEndDate;
		this.applicationStartDate = applicationStartDate;
		this.applicationEndDate = applicationEndDate;
		this.activityCategory = activityCategory;
	}
}
