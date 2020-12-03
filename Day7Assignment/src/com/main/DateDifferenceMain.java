package com.main;

/*
 * Difference between two dates
 */
import java.util.Scanner;

import com.pojo.DateDifference;

public class DateDifferenceMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first date : ");
		String date1 = scanner.nextLine();
		System.out.println("Enter the second date : ");
		String date2 = scanner.nextLine();
		int difference = DateDifference.getDateDifference(date1, date2);
		System.out.println("Difference between the dates : " + difference);
		scanner = null;

	}

}
