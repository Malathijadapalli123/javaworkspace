package com.main;

import java.time.Month;
import java.util.Scanner;

import com.pojo.NumberOfDays;
import com.pojo.NumberOfDays2;

/*
 * Display the Number of days in a month
 */
public class NumberOfDays2Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = scanner.nextInt();
		System.out.println("Enter month : ");
		int month = scanner.nextInt();
		NumberOfDays2 numberofDays = new NumberOfDays2();
		Month month1 = Month.of(month + 1);
		int days = numberofDays.getNumberOfDays(year, month);
		System.out.println(month1 + " : " + days);
		scanner = null;

	}

}
