package com.freightos.SnackVendingMachine.machine;
//controle the whole opperations from here 

import com.freightos.SnackVendingMachine.product.Product;

public interface VendingMachine {
	void addProduct();

	void selectItem();

	void insertMoney(Product item);


	void dispenceItem(Product item);
	 void DisplayMenu();
}
