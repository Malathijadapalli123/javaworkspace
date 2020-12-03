package com.main;

import java.util.Scanner;

import com.pojo.DateFormatConversion;

public class DateFormatConversionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String date = scanner.nextLine();
		System.out.println("Date format after converting : " + DateFormatConversion.convertDateFormat(date));
		scanner = null;
	}

}
