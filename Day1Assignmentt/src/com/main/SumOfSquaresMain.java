package com.main;

import java.util.Scanner;

import com.pojo.CheckSum;
import com.pojo.SumOfSquares;

/*
 * 9. Write a program to read a number, calculate 
 * the sum of squares of even digits (values) present in the given number
 */

public class SumOfSquaresMain {

	public static void main(String[] args) {
		SumOfSquares sumOfSquares = new SumOfSquares();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int result = sumOfSquares.SumOfSquaresOfEvenDigits(number);
		System.out.println("The sum of squares of even digits is : " + result);
		scanner = null;

	}

}
