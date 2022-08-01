package com.josh.java.training.assignment.oops.q5;

import java.util.Date;
import lombok.Data;
//imported data class to implement setter and getter method

@Data
public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));

	}

	@Override
	public String toString() {
		return "Visit{" + "customer name=" + customer.getName() + ", customer member=" + customer.isMember()
				+ ", customer member type=" + customer.getMemberType() + ", date=" + date + ", serviceExpense=$"
				+ serviceExpense + ", productExpense=$" + productExpense + '}';
	}
}
