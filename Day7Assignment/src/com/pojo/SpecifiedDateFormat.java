package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecifiedDateFormat {

	public void displayDate() {
		Date date = new Date();
		SimpleDateFormat simpledateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Date and Time in the Specified format:  " + simpledateFormat.format(date));

	}

}
