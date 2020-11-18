package com.pojo;

public class Swapping {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void SwappingNumbers(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("The numbers After Swapping are " + num1 + " and " + num2);
	}

}
