package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

/*
 * 2.	Write a Java program to print the sum (addition),
 *  multiply, subtract, divide and remainder of two numbers. 
 */

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();
		System.out.println("The Addition of " + num1 + " and " + num2 + " is " + calculator.Addition(num1, num2));
		System.out.println("The Subtraction of " + num1 + " and " + num2 + " is " + calculator.Subtraction(num1, num2));
		System.out.println(
				"The Multiplication of " + num1 + " and " + num2 + " is " + calculator.Multiplication(num1, num2));
		System.out.println("The Division of " + num1 + " and " + num2 + " is " + calculator.Division(num1, num2));
		System.out.println("The Reminder of " + num1 + " and " + num2 + " is " + calculator.Reminder(num1, num2));
		scanner = null;

	}

}
