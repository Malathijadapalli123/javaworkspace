package com.service;

import com.pojo.Cycle;

public class Bike extends Cycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	public Bike() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = df_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}
