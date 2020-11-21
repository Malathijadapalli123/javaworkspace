package com.main;

import java.util.Scanner;

import com.pojo.MiddleCharacter;

/*
 * 2.Write a Java method to display the middle character of a string. 
 */

public class MiddleCharacterMain {

	public static void main(String[] args) {

		MiddleCharacter middle = new MiddleCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next();
		middle.getMiddleCharacter(str);
		scanner = null;

	}

}
