package com.main;

import java.util.Scanner;

import com.pojo.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.nextLine();
		String result = palindrome.palindromeOrNot(str);
		if (str.equals(result)) {
			System.out.println(" The given string is a Palindrome");
		} else {
			System.out.println(" The given string is Not a Palindrome");
		}
		scanner = null;

	}

}
