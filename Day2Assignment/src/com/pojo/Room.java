package com.pojo;

import java.util.Scanner;

public class Room {
	private int roomNo;
	private String roomType;
	private String roomArea;
	private String acMachine;

	public void setData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the room No : ");
		roomNo = scanner.nextInt();
		System.out.println("Enter the room Type : ");
		roomType = scanner.next();
		System.out.println("Enter the room Area : ");
		roomArea = scanner.next();
		System.out.println("Enter the AC Machine : ");
		acMachine = scanner.next();

	}

	public void displayData() {
		System.out.println("The RoomNo is : " + roomNo);
		System.out.println("The RoomType is : " + roomType);
		System.out.println("The RoomArea is : " + roomArea);
		System.out.println("The AC Machine is : " + acMachine);
	}
}
