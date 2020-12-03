package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread2 {
	public void displayDate(Thread t1) throws InterruptedException {

		t1.start();
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
		System.out.println("Current time Before sleep : " + simpleDateFormat.format(date));
		t1.sleep(10000);
		System.out.println("Current time After sleep : " + simpleDateFormat.format(date));

	}

}
