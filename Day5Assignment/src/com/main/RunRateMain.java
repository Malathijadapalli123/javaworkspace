package com.main;

import java.util.Scanner;

import com.pojo.RunRate;

/*
 * 5. Given total runs scored and  total overs faced as the input. 
 * Write a program to calculate the run rate with the formula,
 */
public class RunRateMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalRuns = 0;
		int totalOvers = 0;
		// RunRate runRate = null;
		try {
			System.out.println("Enter the total runs scored ");
			totalRuns = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the total overs faced ");
			totalOvers = Integer.parseInt(scanner.nextLine());

			float runRate = totalRuns / totalOvers;
			System.out.println("Current Run Rate: " + runRate);
		} catch (Exception e) {
			System.err.println(e);
		}
		scanner = null;

	}

}
