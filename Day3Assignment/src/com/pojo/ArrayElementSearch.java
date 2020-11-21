package com.pojo;

public class ArrayElementSearch {

	public void getSearchElement(int[] arr, int s) {
		int c = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] == s) {
				c++;
				break;
			}
		}
		if (c != 0) {
			System.out.println(+s + " is present in the array");
		} else {
			System.out.println(+s + " is not present in the array");
		}

	}

}
