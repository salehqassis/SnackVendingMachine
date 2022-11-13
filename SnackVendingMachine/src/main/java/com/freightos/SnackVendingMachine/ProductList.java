package com.freightos.SnackVendingMachine;

import java.util.ArrayList;

public class ProductList {
	ArrayList<Product> productList = new ArrayList<Product>();

	public void addProduct() {
		//row 1  A
	 	productList.add(new Product("A1", "lays original", 7, 1,1));
		productList.add(new Product("A2", "mr chips", 7, 1,2));
		productList.add(new Product("A3", "Cheetos ketchup", 7, 2,3));
		productList.add(new Product("A4", "lays salt and venigar", 7, 1,4));
		productList.add(new Product("A4", "Cheetos original", 7, 2,5));

		//row 2  B
		productList.add(new Product("B1", "sneakers", 7, 1,6));
		productList.add(new Product("B2", "sneakers white", 7, 1,7));
		productList.add(new Product("B3", "M&Ms", 7, 2,8));
		productList.add(new Product("B4", "flake", 7, 1,9));
		productList.add(new Product("B4", "M&Ms peanuts", 7, 2,10));
	 
		// row 3 C
		 
		productList.add(new Product("C1", "water", 7, 1,11));
		productList.add(new Product("C2", "Sprite", 7, 2.5,12));
		productList.add(new Product("C3", "Coca Cola", 7, 2.5,13));
		productList.add(new Product("C4", "Sprite zero", 7, 2.5,14));
		productList.add(new Product("C4", "Coca Cola zero", 7, 2.5,15));
		
	 
		}
}
