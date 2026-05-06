package com.payal.stream;

public class Customer {
	
	private int id;
	private String name;
	
	Customer(int id, String name) {
		this.id =id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}
