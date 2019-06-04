package com.intensive.sk.entity;

public enum ActivityCategoryType {
	CHILDCARE("Childcare"),
	TEACHING("Teaching"),
	MED_HEALTH("Medical and Healthcare"),
	WILD_ANIMAL("Wildlife and Animal Care"),
	ENV_CONSERV("Environment and Conservation"),
	CONST_RENOV("Construction and Renovation"),
	ART_M("Arts and Music"),
	NGO("NGO Support"),
	ELD("Elderly Care")
	;
	
	private String fullName;

	private ActivityCategoryType(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}
	
	
	
	

}
