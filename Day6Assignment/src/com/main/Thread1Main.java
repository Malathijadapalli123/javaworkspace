package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.pojo.Thread1;
/*
 * 1	Write a program to assign the current thread to t1. 
 * Change the name of the thread to MyThread. 
 * Display the changed name of the thread.
 *  Also it should display the current time. 
 *  Put the thread to sleep for 10 seconds and display the time again.
 */

public class Thread1Main {

	public static void main(String[] args) {
		Thread t1 = new Thread("T1");
		t1.setName("MyThread");
		System.out.println("Name of the thread: " + t1.getName());
		Thread1 thread1 = new Thread1();
		thread1.displayDate(t1);

	}

}
