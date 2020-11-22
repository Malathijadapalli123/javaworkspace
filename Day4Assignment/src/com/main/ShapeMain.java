package com.main;

import java.util.Scanner;

import com.dao.Circle;
import com.dao.Rectangle;
import com.dao.Square;
/*
 * To find the shape and area
 */

public class ShapeMain {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Rectangle");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the shape name : ");
		String str = scanner.nextLine();
		switch (str) {
		case "Circle":

			float area1 = circle.calculateArea();
			System.out.println("Area of circle is : " + area1);
			break;
		case "Square":

			float area2 = square.calculateArea();
			System.out.println("Area of square is : " + area2);
			break;
		case "Rectangle":

			float area3 = rectangle.calculateArea();
			System.out.println("Area of rectangle is : " + area3);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		scanner = null;

	}

}
