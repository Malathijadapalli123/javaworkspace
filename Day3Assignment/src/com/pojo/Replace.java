package com.pojo;

public class Replace {
	private String str;

	public String getStr() {
		return str;
	}

	public String getReplaceString(String str2) {
		String result;
		result = str2.replace('d', 'h');
		return result;
	}

}
