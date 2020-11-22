package com.dao;

import java.util.Scanner;

import com.pojo.Shape;

public class Rectangle extends Shape {
	protected int length;

	protected int breath;

	protected int getLength() {
		return length;
	}

	protected void setLength(int length) {
		this.length = length;
	}

	protected int getBreath() {
		return breath;
	}

	protected void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public float calculateArea() {
		float area;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lengthth : ");
		length = scanner.nextInt();
		System.out.println("Enter the breath : ");
		breath = scanner.nextInt();
		area = length * breath;
		return area;
	}

}
