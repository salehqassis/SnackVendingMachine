package com.freightos.SnackVendingMachine;

public interface Payment {	
	void returnChange(double change);

	boolean checkValidity(double money);

	void insertMoney(double price);
}
