package com.main;

import java.util.Scanner;

import com.pojo.CheckSum;
import com.pojo.LargestWord;

/*
 * 10. Write a Program which finds the longest word from a sentence. 
 * Your program should read a sentence as input from user 
 * and return the longest word. In case there are two words of 
 * maximum length return the word which comes first in the sentence.
 */
public class LargestWordMain {

	public static void main(String[] args) {
		LargestWord word = new LargestWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = scanner.nextLine();
		System.out.println("The Largest Word in the given Sentence is " + word.GetLargestWord(str));
		scanner = null;

	}

}
