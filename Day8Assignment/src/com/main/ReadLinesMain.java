package com.main;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/*
 * 4. Write a Java program to read first 3 lines from a file
 */
public class ReadLinesMain {

	public static void main(String[] args) throws IOException {
		String fileName = "text.txt";

		String line = null;

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

		int i = 0;
		try {
			while (((line = bufferedReader.readLine()) != null) && i < 3) {
				System.out.println(line);
				i++;
			}
		} finally {
			bufferedReader.close();
		}

	}

}
