package com.exception;

public class UserDefinedException extends Exception {
	String information;

	public UserDefinedException(String information) {
		super();
		this.information = information;

	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}
