package com.freightos.SnackVendingMachine;

public class Product {
	
	String location;
	String name;
	int quantity;
	double price;
	int productId;
	
	
	public Product(String location, String name, int quantity, double price ,int productId) {
		super();
		this.location = location;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.productId=productId;
	}

	//location of the item what row and what column 
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductId() {
		return quantity;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
 boolean isAvailable() {
	boolean result;

	 if (this.quantity==0) {
		result=false;
	}else 
		result=true;
	 return result;
 }
}
