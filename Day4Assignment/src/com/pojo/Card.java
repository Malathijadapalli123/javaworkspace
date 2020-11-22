package com.pojo;

public abstract class Card {
	protected static String holderName;
	protected static String cardNumber;
	protected static String expiryDate;

	protected String getHolderName() {
		return holderName;
	}

	protected String getCardNumber() {
		return cardNumber;
	}

	protected String getExpiryDate() {
		return expiryDate;
	}

	protected Card() {
		super();

	}
}
