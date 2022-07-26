package com.josh.java.training.oopsassignment;

import java.util.Date;

class Customer {
	String name;
	boolean member = false;
	String memberType;

	Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
}

class Visit {
	private Customer name;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getCustomerName() {
		return name.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));

	}

	@Override
	public String toString() {
		return "Visit{" + "customer name=" + name.getName() + ", customer member=" + name.isMember()
				+ ", customer member type=" + name.getMemberType() + ", date=" + date + ", serviceExpense=$"
				+ serviceExpense + ", productExpense=$" + productExpense + '}';
	}
}

class DiscountRate {

	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			throw new IllegalArgumentException("wrong service type specified");
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
			throw new IllegalArgumentException("wrong service type specified");
		}
	}  

}


