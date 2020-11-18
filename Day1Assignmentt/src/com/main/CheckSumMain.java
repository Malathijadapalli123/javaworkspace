package com.main;

/*
 * 8. Write a program to read a number and calculate
 *  the sum of odd digits (values) present in the given number.
 */

import java.util.Scanner;

import com.pojo.CheckSum;

public class CheckSumMain {

	public static void main(String[] args) {
		CheckSum checkSum = new CheckSum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int result = checkSum.CheckSumPresent(number);
		if (result == 1) {
			System.out.println("Sum of Odd digits is Odd");
		} else {
			System.out.println("Sum of Odd digits is Even");
		}
		scanner = null;

	}

}
