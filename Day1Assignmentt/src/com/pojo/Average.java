package com.pojo;

public class Average {
	private int num1;
	private int num2;
	private int num3;

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}

	public int AverageOfThreeNumbers(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;

	}
}
