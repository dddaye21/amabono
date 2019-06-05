package com.intensive.sk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name="activity_management")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class ActivityManagement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	private String motive;
	private Status status;
	private long activityId;
	private String activityName;
	private int memberId;
	private String memberName;
	
	public ActivityManagement() {
		super();
		this.id = id;
		this.motive = motive;
		this.status = status;
		this.activityId = activityId;
		this.memberId = memberId;
	}
	
	public ActivityManagement(int id, String motive, Status status, long activityId, String activityName,int memberId, String memberName) {
		super();
		this.id = id;
		this.motive = motive;
		this.status = status;
		this.activityId = activityId;
		this.activityName=activityName;
		this.memberId = memberId;
		this.memberName=memberName;
	}
	

	
}
