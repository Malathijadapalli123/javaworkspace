package com.pojo;

public class Smallest {
	private int num1;
	private int num2;
	private int num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void smallestNumber(int num1, int num2, int num3) {
		if ((num1 < num2) & (num1 < num3)) {
			System.out.println(+num1 + " is the smallest number among three numbers");
		}
		if ((num2 < num1) & (num2 < num3)) {
			System.out.println(+num2 + " is the smallest number among three numbers");
		}
		if ((num3 < num2) & (num3 < num1)) {
			System.out.println(+num3 + " is the smallest number among three numbers");
		}
	}
}
