package com.pojo;

public class CheckSum {
	private int number;

	public int getNumber() {
		return number;
	}

	public static int CheckSumPresent(int number) {
		int reminder;
		int sum = 0;
		while (number != 0) {
			reminder = number % 10;
			if (reminder % 2 != 0) {
				sum = sum + reminder;
			}
			number = number / 10;
		}
		if (sum % 2 != 0) {
			return 1;
		} else {
			return -1;
		}

	}

}
