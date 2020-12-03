package com.main;

import com.pojo.DemoThread1;

/*
 * 3	Write a program to create a class DemoThread1 implementing Runnable interface. 
 * In the constructor, create a new thread and start the thread. 
 * In run() display a message "running child Thread in loop :
 *  " display the value of the counter ranging from 1 to 10. 
 *  Within the loop put the thread to sleep for 2 seconds. 
 *  In main create 3 objects of the DemoTread1 and execute the program.
 */
public class Thread3Main {

	public static void main(String[] args) {
		DemoThread1 demoThread1 = new DemoThread1();
		DemoThread1 demoThread2 = new DemoThread1();
		DemoThread1 demoThread3 = new DemoThread1();
		demoThread1.run();
		demoThread2.run();
		demoThread3.run();

	}

}
