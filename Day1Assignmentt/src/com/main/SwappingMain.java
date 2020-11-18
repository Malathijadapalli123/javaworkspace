package com.main;

import java.util.Scanner;

import com.pojo.Swapping;

/*
 * 4. Write a Java program to swap two variables.
 */

public class SwappingMain {

	public static void main(String[] args) {
		Swapping swapping = new Swapping();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();
		System.out.println("The numbers Before swapping are " + num1 + " and " + num2);
		swapping.SwappingNumbers(num1, num2);
		scanner = null;

	}

}
