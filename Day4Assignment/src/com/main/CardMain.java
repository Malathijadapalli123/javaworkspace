package com.main;

import java.util.Scanner;

import com.dao.MembershipCard;
import com.dao.PayBackCard;
/*
 * printing card details
 */

public class CardMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the card : ");
		System.out.println("1.Membership Card details: ");
		System.out.println("2.PayBack Card details : ");
		System.out.println("Enter the card details : ");
		System.out.println("Enter the card holder name : ");
		String holderName = scanner.nextLine();
		System.out.println("Enter the card number : ");
		String cardNumber = scanner.nextLine();
		System.out.println("Enter the card expiry date : ");
		String expiryDate = scanner.nextLine();
		MembershipCard membershipCard = new MembershipCard();
		PayBackCard payBackcard = new PayBackCard();
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:

			System.out.println("Enter the member rating : ");
			membershipCard.setRating(scanner.nextInt());
			membershipCard.getMembershipCardDetails(holderName, cardNumber, expiryDate);
			break;
		case 2:

			System.out.println("Enter the points in card : ");
			payBackcard.setPointsEarned(scanner.nextInt());
			System.out.println("Enter the Total Amount : ");
			payBackcard.setTotalAmount(scanner.nextDouble());
			payBackcard.getPayBackCardDetails(holderName, cardNumber, expiryDate);
			break;
		default:
			System.out.println("Invalid choice");
			break;

		}
		scanner = null;

	}

}
