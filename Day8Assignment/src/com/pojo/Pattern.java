package com.pojo;

public class Pattern {
	public static int countOfSubString(String str, String subStr) {

		int j;
		int count = 0;
		int x = str.length();
		int y = subStr.length();
		for (int i = 0; i <= y - x; i++) {
			for (j = 0; j < x; j++) {
				if (subStr.charAt(i + j) != str.charAt(j)) {
					break;
				}
			}
			if (j == x)
				count++;
		}

		return count;
	}

}
