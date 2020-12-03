package com.main;

/*
 * 2.Java has built-in mechanism to handle exceptions. 
 * Using the try statement we can test a block of code for errors. 
 * The catch block contains the code that says what to do if exception occurs. 
 */
import java.util.Scanner;

import com.pojo.TryCatch;

public class TryCatchMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			System.err.println(e);
		}
		scanner = null;
	}

}
