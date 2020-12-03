package com.pojo;

import com.exception.UserDefinedException;

public class MyCalculator {
	public long power(int number1, int number2) {

		long result = 0;
		try {
			if (number1 > 0 && number2 > 0) {
				result = (long) Math.pow(number1,number2);
			} else if (number1 == 0 && number2 == 0) {
				throw new UserDefinedException("java.lang.Exception: n and p should not be zero");
			} else if (number1 < 0 && number2 < 0) {
				throw new UserDefinedException("java.lang.Exception: n and p should not be negative");
			} else {
				throw new UserDefinedException("java.lang.Exception: n and p should not be negative");
			}
		} catch (UserDefinedException e) {
			System.err.println(e.getInformation());
		}

		return result;
	}

}
