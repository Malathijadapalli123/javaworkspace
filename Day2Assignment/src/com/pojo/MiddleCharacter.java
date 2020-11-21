package com.pojo;

public class MiddleCharacter {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void getMiddleCharacter(String str) {
		int len = str.length();
		int middleChar = (len / 2) - 1;
		int c = (len / 2) + 1;
		if (len % 2 == 0) {
			str.substring(middleChar, c);
			System.out.println(str.substring(middleChar, c));
		}

		else {
			System.out.println(str.charAt(c - 1));
		}
	}

}
