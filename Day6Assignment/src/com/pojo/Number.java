package com.pojo;

public class Number implements Runnable{

	private int number;

	public Number(int number) {
		this.number = number;
	}
    @Override
	public void run() {

		for (int i = 1; i < 100; i++) {
			if (i % number == 0) {
				System.out.println("Multiple of " + number + ": " + i);
			}
		}

	}

	
}
