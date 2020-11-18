package com.pojo;

public class PrimeNumber {
	private int num;

	public int getNum() {
		return num;
	}

	public void PrimeOrNot(int num) {
		int flag = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(+num + " is a Prime Number");
		} else {
			System.out.println(+num + " is Not a Prime Number");
		}
	}
}
