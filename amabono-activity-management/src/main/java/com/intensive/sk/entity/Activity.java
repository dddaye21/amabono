package com.intensive.sk.entity;

import lombok.Data;

@Data
public class Activity {
	private int id;
	private String loginId;
	private String password;
	private String username;
	private Interests interests;
	private Location location;
	private Major major;
	private MemberType memberType;
	
	public Activity() {
		super();
		this.id = id;
		this.interests = interests;
		this.location = location;
		this.major = major;
		this.loginId = loginId;
		this.password = password;
		this.memberType = memberType;
		this.username = username;
	}

	public Activity(int id, Interests interests, Location location, Major major, String loginId, String password,
			MemberType memberType, String username) {
		super();
		this.id = id;
		this.interests = interests;
		this.location = location;
		this.major = major;
		this.loginId = loginId;
		this.password = password;
		this.memberType = memberType;
		this.username = username;
	}
}
