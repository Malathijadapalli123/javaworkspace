package com.main;

import java.util.Scanner;

import com.pojo.PrimeNumber;

/*
 * 5. Write a java program, which will take a number variable
 *  and check whether the number is prime or not
 */

public class PrimeNumberMain {

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		prime.PrimeOrNot(num);
		scanner = null;

	}

}
