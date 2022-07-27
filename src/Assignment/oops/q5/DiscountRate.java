package com.josh.java.training.assignment.oops.q5;

public class DiscountRate {

	private final static double serviceDiscountPremium = 0.2;
	private final static double serviceDiscountGold = 0.15;
	private final static double serviceDiscountSilver = 0.1;
	private final static double productDiscountPremium = 0.1;
	private final static double productDiscountGold = 0.1;
	private final static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			return 0.0;
		}
	}

	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return productDiscountPremium;
		case "Gold":
			return productDiscountGold;
		case "Silver":
			return productDiscountSilver;
		default:
			return 0.0;
		}
	}
}
