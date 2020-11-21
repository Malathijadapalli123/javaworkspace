package com.main;

/*
 * 5.	Accept a string, and two indices(integers), 
 * and print the substring consisting of all characters inclusive range from ..to 
 */
import java.util.Scanner;

import com.pojo.SubString;

public class SubStringMain {

	public static void main(String[] args) {
		SubString sub = new SubString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.nextLine();
		System.out.println("Enter the two indices : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String str1 = sub.getSubString(str, a, b);
		System.out.println("The substring of given string is " + str1);
		scanner = null;

	}

}
