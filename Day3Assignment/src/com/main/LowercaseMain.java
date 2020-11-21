package com.main;

import java.util.Scanner;

/*
 * 1.	Write a Java program to convert all the characters in a string to lowercase.
 */
import com.pojo.Lowercase;

public class LowercaseMain {

	public static void main(String[] args) {
		Lowercase lowerCase = new Lowercase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		String str1 = lowerCase.getLowerCaseString(str);
		System.out.println("The lowercase of given string is : " + str1);

		scanner = null;

	}

}
