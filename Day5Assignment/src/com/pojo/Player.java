package com.pojo;

import com.exception.CustomException;

public class Player {
	private String playerName;
	private int playerAge;

	public Player(String playerName, int age) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	public void getPlayerDetails() {

		try {
			if (playerAge < 19) {

				throw new CustomException("Invalid Age Range Exception");

			} else {
				System.out.println("Player name : " + playerName);
				System.out.println("Player age : " + playerAge);
			}
		} catch (CustomException e) {
			System.err.println("CustomException : " + e.getInformation());
		}
	}

}
