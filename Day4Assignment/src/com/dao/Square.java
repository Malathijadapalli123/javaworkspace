package com.dao;

import java.util.Scanner;

import com.pojo.Shape;

public class Square extends Shape {
	protected int side;

	protected int getSide() {
		return side;
	}

	protected void setSide(int side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		Scanner scanner = new Scanner(System.in);
		float area;
		System.out.println("Enter the side : ");
		side = scanner.nextInt();
		area = side * side;
		return area;
	}

}
