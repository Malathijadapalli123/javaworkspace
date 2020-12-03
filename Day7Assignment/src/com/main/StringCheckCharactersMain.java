package com.main;

import java.util.Scanner;

import com.pojo.StringCheckCharacter;

public class StringCheckCharactersMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String string = scanner.nextLine();
		StringCheckCharacter stringCheckCharacter=new StringCheckCharacter(); 
		int result = stringCheckCharacter.checkCharacters(string);
		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}

	}

}
