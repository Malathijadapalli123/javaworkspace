package com.main;

import java.util.Scanner;

import com.pojo.DateDifference;
import com.pojo.MonthDifference;

public class MonthDifferenceMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first date : ");
		String date1 = scanner.nextLine();
		System.out.println("Enter the second date : ");
		String date2 = scanner.nextLine();
		int difference = MonthDifference.getMonthDifference(date1, date2);
		System.out.println("Difference between the dates as per months: " + difference);
		scanner = null;

	}

}
