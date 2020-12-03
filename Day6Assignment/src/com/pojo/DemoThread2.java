package com.pojo;

public class DemoThread2 extends Thread {

	Thread t1 = null;

	public DemoThread2() {

		t1 = new Thread();
		t1.start();
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("running child Thread in loop :" + i);
			try {
				t1.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
