package com.intensive.sk.entity;

import lombok.Data;

@Data
public class ActivityManagement {
	private int id;
	private String motive;
	private Status status;
	private Activity activity;
	private Member member;
	
	public ActivityManagement() {
		super();
		this.id = id;
		this.motive = motive;
		this.status = status;
		this.activity = activity;
		this.member = member;
	}
	
	public ActivityManagement(int id, String motive, Status status, Activity activity, Member member) {
		super();
		this.id = id;
		this.motive = motive;
		this.status = status;
		this.activity = activity;
		this.member = member;
	}
	
}
