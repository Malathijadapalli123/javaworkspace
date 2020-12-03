package com.main;

/*
 * 3. You are required to compute the power of a number by implementing a calculator.
 */
import java.util.Scanner;

import com.pojo.MyCalculator;

public class MyCalculatorMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyCalculator myCalculator = new MyCalculator();
		long[] input = new long[5];
		int number1 = 0;
		int number2 = 0;
		for (int i = 0; i < 5; i++) {
			number1 = scanner.nextInt();
			number2 = scanner.nextInt();
			long result = myCalculator.power(number1, number2);
			if (result != 0) {
				System.out.println(result);
			}
		}
		scanner = null;

	}

}
