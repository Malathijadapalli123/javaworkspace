package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread1 {

	public void displayDate(Thread t1) {
		try {
			t1.start();
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
			System.out.println("Current time Before sleep : " + simpleDateFormat.format(date));
			t1.sleep(10000);
			System.out.println("Current time After sleep : " + simpleDateFormat.format(date));
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
