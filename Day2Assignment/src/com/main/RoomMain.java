package com.main;

import com.pojo.Room;

/*
 * 4. Write a program to create a room class, the attributes
 *  of this class is roomno, roomtype, roomarea and ACmachine. 
 *  In this class the member functions are setdata and displaydata
 */
public class RoomMain {

	public static void main(String[] args) {
		Room room = new Room();
		room.setData();
		room.displayData();

	}

}
