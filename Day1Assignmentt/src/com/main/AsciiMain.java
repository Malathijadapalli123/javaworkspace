package com.main;

import java.util.Scanner;

import com.pojo.Ascii;

/*
 * 6. Write a Java program to print the ascii value of a given character. 
 */

public class AsciiMain {
	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = scanner.next().charAt(0);
		System.out.println("The Ascii value of " + ch + " is " + ascii.FindAsciiValue(ch));
		scanner = null;

	}

}
