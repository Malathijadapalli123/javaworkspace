package com.pojo;

public class A {
	private String empName = "Hello";
	private float salary = 20000.45f;
	private int empId = 231456;

	public void empDetails() {
		System.out.println("Employee Details : ");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee salary : " + salary);
		System.out.println("Employee ID : " + empId);
	}

}
