package com.intensive.sk.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name="member")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	
	private String loginId;
	private String password;
	private String username;
	private Interests interests;
	private Location location;
	private Major major;
	private MemberType memberType;
	
	public Member() {
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
	
	public Member(int id, String name, ActivityStatus status, String detail, Date activityStartDate,
			Date activityEndDate, Date applicationStartDate, Date applicationEndDate,
			ActivityCategory activityCategory) {
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
