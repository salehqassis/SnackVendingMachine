package com.freightos.SnackVendingMachine;

public enum MoneyEnum {

	CENTS10(0.10), CENTS20(0.20), CENTS50(0.50), USD(1), USD20(20), USDS50(50);

	private MoneyEnum(double value) {
		this.value = value;
	}

	double value;
	int quantity;

	private MoneyEnum(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
