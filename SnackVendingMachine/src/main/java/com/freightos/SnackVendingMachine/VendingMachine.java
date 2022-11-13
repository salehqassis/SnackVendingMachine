package com.freightos.SnackVendingMachine;
//controle the whole opperations from here 

public interface VendingMachine {
	void addProduct();

	void selectItem();

	void insertMoney(Product item);

	void returnChange();

	void dispenceItem(Product item);
	 void DisplayMenu();
}
