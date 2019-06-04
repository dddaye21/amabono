package com.intensive.sk.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;

@Data
@Embeddable
@Builder
public class ApplicationPeriod {
	private LocalDate applicationStartDate;
	private LocalDate applicationEndDate;
	
	public ApplicationPeriod(LocalDate applicationStartDate, LocalDate applicationEndDate) {
		super();
		this.applicationStartDate = applicationStartDate;
		this.applicationEndDate = applicationEndDate;
	}
	

	

	
	

}
