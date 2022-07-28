package com.josh.java.training.assignment.oops.q5;

import java.util.Date;
import lombok.Data;
//imported data class to implement setter and getter method

@Data
public class Visit {
	private Customer c;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer c, Date date) {
		this.c = c;
		this.date = date;
	}

	public String getCustomerName() {
		return c.getName();
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(c.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(c.getMemberType())));

	}

	@Override
	public String toString() {
		return "Visit{" + "customer name=" + c.getName() + ", customer member=" + c.isMember()
				+ ", customer member type=" + c.getMemberType() + ", date=" + date + ", serviceExpense=$"
				+ serviceExpense + ", productExpense=$" + productExpense + '}';
	}
}
