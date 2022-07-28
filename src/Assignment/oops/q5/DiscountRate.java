package com.josh.java.training.assignment.oops.q5;

public class DiscountRate {

	private final static double SERVICEDISCOUNTPREMIUM = 0.2;
	private final static double SERVICEDISCOUNTGOLD = 0.15;
	private final static double SERVICEDISCOUNTSILVER = 0.1;
	private final static double PRODUCTDISCOUNTPREMIUM = 0.1;
	private final static double PRODUCTDISCOUNTGOLD = 0.1;
	private final static double PRODUCTDISCOUNTSILVER = 0.1;

	// This method returns the value of service discount rate
	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return SERVICEDISCOUNTPREMIUM;
		case "Gold":
			return SERVICEDISCOUNTGOLD;
		case "Silver":
			return SERVICEDISCOUNTSILVER;
		default:
			return 0.0;
		}
	}

	// This method returns the value of product discount rate
	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return PRODUCTDISCOUNTPREMIUM;
		case "Gold":
			return PRODUCTDISCOUNTGOLD;
		case "Silver":
			return PRODUCTDISCOUNTSILVER;
		default:
			return 0.0;
		}
	}
}
