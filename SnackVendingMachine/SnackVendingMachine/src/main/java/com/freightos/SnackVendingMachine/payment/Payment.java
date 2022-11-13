package com.freightos.SnackVendingMachine.payment;

public interface Payment {	
	void returnChange(double change);

	boolean checkValidity(double money);

	void insertMoney(double price);
}
