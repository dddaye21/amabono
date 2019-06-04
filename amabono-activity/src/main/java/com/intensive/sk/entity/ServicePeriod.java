package com.intensive.sk.entity;

import java.time.LocalDate;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;

@Data
@Embeddable
@Builder
public class ServicePeriod {
	private LocalDate serviceStartDate;
	private LocalDate serviceEndDate;
	
	public ServicePeriod(LocalDate serviceStartDate, LocalDate serviceEndDate) {
		super();
		this.serviceStartDate = serviceStartDate;
		this.serviceEndDate = serviceEndDate;
	}
	

}
