package com.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 3. Write a Java program to append text to an existing file.
 */
public class AppendMain {

	public static void main(String[] args) {
		try {
			String data = " Welcome to File appending";
			File f1 = new File("text.txt");
			if (!f1.exists()) {
				f1.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(f1.getName(), true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
