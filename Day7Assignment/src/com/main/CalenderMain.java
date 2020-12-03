package com.main;

import com.pojo.Calender;

/*
 * get and displays the default calender
 */
public class CalenderMain {

	public static void main(String[] args) {
		Calender calender=new Calender();
		calender.getAndDisplayCalender();
		calender=null;
		
	}

}
