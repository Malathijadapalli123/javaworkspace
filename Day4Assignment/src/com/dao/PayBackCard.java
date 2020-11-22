package com.dao;

import com.pojo.Card;

public class PayBackCard extends Card {
	protected int pointsEarned;
	protected double totalAmount;

	protected int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	protected double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void getPayBackCardDetails(String name, String cardNumber, String expirydate) {

		System.out.println("Payback Card details");
		System.out.println("Card Holder Name : "+name);
		System.out.println("Card Number : " + cardNumber);
		System.out.println("Card Expiry date : " + expirydate);
		System.out.println("Points earned : " + pointsEarned);
		System.out.println("Total Amount : " + totalAmount);

	}

}
