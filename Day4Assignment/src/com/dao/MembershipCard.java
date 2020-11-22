package com.dao;

import com.pojo.Card;

public class MembershipCard extends Card {
	protected int rating;

	protected int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void getMembershipCardDetails(String name, String cardNumber,String expirydate) {
		System.out.println("Payback Card details");
		System.out.println("Card Holder Name : "+name);
		System.out.println("Card Number : " + cardNumber);
		System.out.println("Card Expiry date" + expirydate);
		System.out.println("Member Rating : " + rating);

	}

}
