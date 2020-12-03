package com.main;

import com.pojo.DemoThread1;
import com.pojo.DemoThread2;

/*
 * 4	Rewrite the earlier program so that, now the class DemoThread1 
 * instead of implementing from Runnable interface, will now extend from Thread class.


 */
public class Thread4Main {

	public static void main(String[] args) {
		DemoThread2 demoThread1 = new DemoThread2();
		DemoThread2 demoThread2 = new DemoThread2();
		DemoThread2 demoThread3 = new DemoThread2();
		demoThread1.run();
		demoThread2.run();
		demoThread3.run();

	}

}
