package com.main;

/*
 * Display days in a month
 */
import java.time.Month;
import java.util.Scanner;

import com.pojo.NumberOfDays;

public class NumberOfDaysMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = scanner.nextInt();
		System.out.println("Enter month : ");
		int month = scanner.nextInt();
		NumberOfDays numberofDays = new NumberOfDays();
		Month month1 = Month.of(month + 1);
		int days = numberofDays.getNumberOfDays(year, month);
		System.out.println(month1 + " : " + days);
		scanner = null;

	}

}
