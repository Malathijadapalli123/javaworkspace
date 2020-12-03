package com.pojo;

public class StringCheckCharacter {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int checkCharacters(String string) {
		if (string.charAt(0) == string.charAt(string.length() - 1)) {
			return 1;
		} else {
			return -1;
		}

	}

}
