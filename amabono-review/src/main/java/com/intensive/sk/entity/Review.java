package com.intensive.sk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name="review")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
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
