package com.main;

/*
 * 1. Write a Java program by using BufferedReader class  
 * to prompt a user to input his/her 
 */
import java.io.BufferedReader;

import java.io.InputStreamReader;

import com.pojo.BfReader;

public class BufferReaderMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		BfReader.append(str);
		br.close();

	}

}
