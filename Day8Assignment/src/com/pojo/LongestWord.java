package com.pojo;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class LongestWord {
	public static String getLongestWord() throws IOException {
		String longestWord = "";
		String current;
		Scanner scan = new Scanner(new File("text.txt"));

		while (scan.hasNext()) {
			current = scan.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;

			}

		}
		return longestWord;
	}
}
