package com.main;

/*
 * 2.	Write a Java program to replace all the 'd' occurrence characters
  *with ‘h’ characters in each string.
  */
import java.util.Scanner;

import com.pojo.Replace;

public class ReplaceMain {

	public static void main(String[] args) {
		Replace replace = new Replace();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scanner.nextLine();
		String str1 = replace.getReplaceString(str);
		System.out.println("After replacing d with h : " + str1);
		scanner = null;

	}

}
