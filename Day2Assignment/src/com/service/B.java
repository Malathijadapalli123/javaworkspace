package com.service;

import com.pojo.A;

public class B extends A {
	private String empCity = "SPSR Nellore";
	private String empState = "AP";
	private int empDoorNo = 1234;

	public void employeeAddress() {
		System.out.println("Employee Address Details :");
		System.out.println("Employee DoorNo : " + empDoorNo);
		System.out.println("Employee City : " + empCity);
		System.out.println("Employee State : " + empState);

	}

}
