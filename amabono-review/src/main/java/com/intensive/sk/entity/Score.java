package com.intensive.sk.entity;

public enum Score {
    N1(1), 
    N2(2), 
    N3(3);
	
	Score(int value) {
		this.value = value;
	}
	
    private int value;
}
