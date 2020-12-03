package com.pojo;

import java.io.FileOutputStream;
import java.io.IOException;

public class PlayerDetails {

	public static void getPlayerDetails(String name, String teamName, int noOfMatches) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
		fileOutputStream.write(name.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(teamName.getBytes());
		fileOutputStream.write(',');
		fileOutputStream.write(String.valueOf(noOfMatches).getBytes());

		fileOutputStream.close();

	}

}
