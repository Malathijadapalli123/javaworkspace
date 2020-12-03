package com.main;

/*
 * 5. Write a Java program to find the longest word in a text file
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.pojo.LongestWord;

public class LongestWordMain {

	public static void main(String[] args) throws IOException {
		LongestWord longestWord = new LongestWord();
		String str = longestWord.getLongestWord();
		System.out.println("The longest word in the sentence is : " + str);

	}

}
