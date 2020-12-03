package com.exception;

public class CustomException extends Exception {
	String information = "InvalidAgeRangeException";

	public CustomException(String message) {
		super();
		this.information = information;
	}

	public String getInformation() {
		return information;
	}

}
