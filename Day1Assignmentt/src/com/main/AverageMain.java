package com.main;

import java.util.Scanner;

import com.pojo.Average;

/*
 * 3.Write a Java program that takes three numbers as input 
 * to calculate and print the average of the numbers
 */
public class AverageMain {

	public static void main(String[] args) {

		Average average = new Average();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int num3 = scanner.nextInt();
		System.out.println("The Average of Three numbers is : " + average.AverageOfThreeNumbers(num1, num2, num3));
		scanner = null;

	}

}
