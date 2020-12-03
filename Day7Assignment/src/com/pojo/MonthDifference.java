package com.pojo;

public class MonthDifference {

	public static int getMonthDifference(String date1, String date2) {
		String[] firstDate = date1.split("-");
		String[] secondDate = date2.split("-");
		int months = Math.abs(Integer.parseInt(firstDate[0])) - Math.abs(Integer.parseInt(secondDate[0]));
		int countOfMonths = months * 12;
		countOfMonths += Math.abs(Integer.parseInt(firstDate[1]) - Integer.parseInt(secondDate[1]));
		return countOfMonths;

	}

}
