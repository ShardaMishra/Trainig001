package com.josh.java.training.assignment.oops.q5;

public class DiscountRate {

	private final static double SERVICE_DISCOUNT_PREMIUM = 0.2;
	private final static double SERVICE_DISCOUNT_GOLD = 0.15;
	private final static double SERVICE_DISCOUNT_SILVER = 0.1;
	private final static double PRODUCT_DISCOUNT_PREMIUM = 0.1;
	private final static double PRODUCT_DISCOUNT_GOLD = 0.1;
	private final static double PRODUCT_DISCOUNT_SILVER = 0.1;

	// This method returns the value of service discount rate
	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return SERVICE_DISCOUNT_PREMIUM;
		case "Gold":
			return SERVICE_DISCOUNT_GOLD;
		case "Silver":
			return SERVICE_DISCOUNT_SILVER;
		default:
			return 0.0;
		}
	}

	// This method returns the value of product discount rate
	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return PRODUCT_DISCOUNT_PREMIUM;
		case "Gold":
			return PRODUCT_DISCOUNT_GOLD;
		case "Silver":
			return PRODUCT_DISCOUNT_SILVER;
		default:
			return 0.0;
		}
	}
}
