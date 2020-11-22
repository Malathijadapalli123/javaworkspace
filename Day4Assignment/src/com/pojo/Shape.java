package com.pojo;

public abstract class Shape {
	protected String name;

	protected Shape() {
		super();

	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected abstract float calculateArea();

}
