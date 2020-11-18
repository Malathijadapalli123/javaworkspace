package com.pojo;

public class FizzBuzz {

	public void PrintFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) & (i % 5 != 0)) {
				System.out.println(+i + " : Fizz");
			} else if ((i % 5 == 0) & (i % 3 != 0)) {
				System.out.println(+i + " : Buzz");
			} else if ((i % 5 == 0) & (i % 3 == 0)) {
				System.out.println(+i + " : Fizz Buzz");
			}
		}

	}

}
