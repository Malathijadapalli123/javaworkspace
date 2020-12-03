package com.main;

import java.util.Scanner;

import com.pojo.Pattern;

public class PatternMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of words");
		int number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the strings to be searched ");
		String[] strings = new String[number];
		for (int i = 0; i < number; i++) {
			strings[i] = scanner.nextLine();
		}
		System.out.println("Given String is : ");
		String str = scanner.nextLine();
		for (int i = 0; i < number; i++) {
			int count = Pattern.countOfSubString(strings[i], str);
			System.out.println("Word: " + strings[i] + "	Count: " + count);
		}

	}

}
