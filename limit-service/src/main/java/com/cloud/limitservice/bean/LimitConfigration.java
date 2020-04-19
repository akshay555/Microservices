package com.cloud.limitservice.bean;

public class LimitConfigration {
	
	private int maximum;
	private int minimum;
	
	
	public LimitConfigration() {
		super();
	}
	
	public LimitConfigration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	

}
