package com.main;

/*
 * 4. Write a program to get the name and age of the player from the user and  display it
 */
import java.util.Scanner;

import com.pojo.Player;

public class PlayerMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter player name :");
		String playerName = scanner.nextLine();
		System.out.println("Enter the player age :");
		int playerAge = scanner.nextInt();
		Player player = new Player(playerName, playerAge);
		player.getPlayerDetails();
		scanner = null;

	}

}
