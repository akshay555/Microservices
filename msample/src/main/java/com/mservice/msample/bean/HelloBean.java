package com.mservice.msample.bean;

public class HelloBean {
	
	public HelloBean(String message) {
		super();
		this.message = message;
	}


	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
