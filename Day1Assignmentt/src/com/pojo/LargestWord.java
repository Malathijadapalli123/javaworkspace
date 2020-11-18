package com.pojo;

public class LargestWord {
	private String str;

	public String getStr() {
		return str;
	}

	public String GetLargestWord(String str) {

		String[] word = str.split(" ");
		String largestWord = " ";
		for (int i = 0; i < word.length; i++) {
			for (int j = 1 + i; j < word.length; j++) {
				
				if (word[i].length() >= word[j].length()) {
					largestWord = word[i];
				 }
				 
				
			}
				
	  }
		for (int i = 0; i < word.length; i++) {
			for (int j = 1 + i; j < word.length; j++) {
				
				if (word[i].length() == word[j].length()) {
					largestWord = word[i];
				 }
				 
				
			}
	       break;
				
	  }

		return largestWord;
	}

}
