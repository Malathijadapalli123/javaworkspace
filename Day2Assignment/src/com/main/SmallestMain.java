package com.main;

import java.util.Scanner;

import com.pojo.Smallest;

/*
 * 1.Write a Java method to find the smallest number among three numbers
 */

public class SmallestMain {

	public static void main(String[] args) {
		Smallest small = new Smallest();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int num3 = scanner.nextInt();
		small.smallestNumber(num1, num2, num3);
		scanner = null;

	}

}
