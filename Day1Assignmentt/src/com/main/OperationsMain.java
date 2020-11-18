package com.main;

import com.pojo.Operations;

/*
 * 1.	Write a Java program to print the result of the following operations
 */

public class OperationsMain {

	public static void main(String[] args) {
		Operations operations = new Operations();
		System.out.println("The value of First fuction is : " + operations.Function1());
		System.out.println("The value of Second fuction is : " + operations.Function2());
		System.out.println("The value of Third fuction is : " + operations.Function3());
		System.out.println("The value of Fourth fuction is : " + operations.Function4());

	}

}
