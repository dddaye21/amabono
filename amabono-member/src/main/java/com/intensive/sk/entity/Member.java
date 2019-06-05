package com.intensive.sk.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	@Enumerated(EnumType.STRING)
	private Interests interests;
	@Enumerated(EnumType.STRING)
	private Location location;
	@Enumerated(EnumType.STRING)
	private Major major;
	@Enumerated(EnumType.STRING)
	private MemberType memberType;
	
	public Member() {
		
	}
	
	public Member(int id, String loginId, String password, String username, Interests interests, Location location,
			Major major, MemberType memberType) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.username = username;
		this.interests = interests;
		this.location = location;
		this.major = major;
		this.memberType = memberType;
	}

}
