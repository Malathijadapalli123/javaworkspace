package com.pojo;

public class SumOfSquares {
	private int number;

	public int getNumber() {
		return number;
	}

	public static int SumOfSquaresOfEvenDigits(int number) {
		int reminder;
		int sum = 0;
		while (number != 0) {
			reminder = number % 10;
			if (reminder % 2 == 0) {
				sum = sum + reminder * reminder;
			}
			number = number / 10;
		}

		return sum;
	}

}
