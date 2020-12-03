package com.main;

/*
 * 2	In the previous program remove the try{}catch(){} block 
 * surrounding the sleep method and try to execute the code. What is your observation?


 */
import com.pojo.Thread1;

public class Thread2Main {

	public static void main(String[] args) {
		Thread t1 = new Thread("T1");
		t1.setName("MyThread");
		System.out.println("Name of the thread: " + t1.getName());
		Thread1 thread1 = new Thread1();
		thread1.displayDate(t1);

	}

}
