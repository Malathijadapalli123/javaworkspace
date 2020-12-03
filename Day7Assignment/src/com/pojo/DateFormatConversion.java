package com.pojo;

public class DateFormatConversion {
	public static String convertDateFormat(String date) {

		String dateFormat = date.replaceAll("/", "-");
		return dateFormat;
	}

}
