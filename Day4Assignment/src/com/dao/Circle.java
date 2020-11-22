package com.dao;

import java.util.Scanner;

import com.pojo.Shape;

public class Circle extends Shape {
	private static final float PI = 3.14f;
	protected int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		Scanner scanner = new Scanner(System.in);
		float area;
		System.out.println("Enter the radius : ");
		radius = scanner.nextInt();
		area = (float) (PI * (radius * radius));
		return area;
	}

}
