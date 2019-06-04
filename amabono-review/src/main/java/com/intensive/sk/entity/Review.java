package com.intensive.sk.entity;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Review {
	
	@Id
	private int id;
	private int applyManagementId;
	private Score score;
	private String contents;
	
	public Review() {
		super();
		this.id = id;
		this.applyManagementId = applyManagementId;
		this.score = score;
		this.contents = contents;
	}
	
	public Review(int id, int applyManagementId, Score score, String contents) {
		super();
		this.id = id;
		this.applyManagementId = applyManagementId;
		this.score = score;
		this.contents = contents;
	}
}
