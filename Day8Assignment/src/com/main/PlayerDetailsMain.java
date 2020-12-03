package com.main;

import java.io.IOException;
import java.util.Scanner;

import com.pojo.PlayerDetails;

public class PlayerDetailsMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the player");
		String name = scanner.nextLine();
		System.out.println("Enter the team name ");
		String teamName = scanner.nextLine();
		System.out.println("Enter the number of matches played ");
		int noOfMatches = scanner.nextInt();
		PlayerDetails.getPlayerDetails(name, teamName, noOfMatches);

	}

}
