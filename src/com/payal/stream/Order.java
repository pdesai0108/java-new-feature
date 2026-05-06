package com.payal.stream;

public class Order {
	
	private int id;
	private int customerId;
	private double amount;
	
	Order(int id, int customerId, double amount) {
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
