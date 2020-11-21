package com.pojo;

public class CountVowels {
	private String str;

	public String getStr() {
		return str;
	}

	public int getVowelsCount(String str) {
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'A' | str.charAt(i) == 'E' | str.charAt(i) == 'I' | str.charAt(i) == 'O'
					| str.charAt(i) == 'U' | str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'i'
					| str.charAt(i) == 'o' | str.charAt(i) == 'u') {
				count=count+1;
			}

		}
		return count;
	}

}
