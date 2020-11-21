package com.main;

import java.util.Scanner;

import com.pojo.CountVowels;

/*
 * 3. Write a Java method to count all vowels in a string.
 */
public class CountVowelsMain {

	public static void main(String[] args) {
		CountVowels countVowels = new CountVowels();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scanner.nextLine();
		System.out.println("The count of vowels in a given string are : " + countVowels.getVowelsCount(str));
		scanner = null;

	}

}
