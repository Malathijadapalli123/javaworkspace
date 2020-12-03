package com.main;

import com.pojo.Number;

/*
 * Write a program to create a class Number  which implements Runnable.
 *  Run method displays the multiples of a number accepted as a parameter
 */
public class Thread5Main {

	public static void main(String[] args) {
		Number number1 = new Number(2);
		Number number2 = new Number(5);
		Number number3 = new Number(8);

		Thread thread = new Thread();

		System.out.println("Begininng of the Thread which displays multiplies of 2");
		number1.run();
		System.out.println("End of the Thread");

		System.out.println("Begininng of the Thread which displays multiplies of 5");
		number2.run();
		System.out.println("End of the Thread");

		System.out.println("Begininng of the Thread which displays multiplies of 8");
		number3.run();
		System.out.println("End of the Thread");

	}

}
