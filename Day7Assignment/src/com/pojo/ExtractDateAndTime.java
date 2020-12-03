package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateAndTime {

	public void getExtractDateAndTime() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("The extracted date : " + simpleDateFormat1.format(date));
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("The extracted time : " + simpleDateFormat2.format(date));

	}

}
