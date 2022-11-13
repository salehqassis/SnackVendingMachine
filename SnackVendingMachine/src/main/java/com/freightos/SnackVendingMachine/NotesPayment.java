package com.freightos.SnackVendingMachine;

import java.util.Scanner;

public class NotesPayment implements Payment {
	Scanner scanner = new Scanner(System.in);
	String coins[]= {"20USD","1USD","0.5USD","0.2USD","0.1USD"};

	@Override
	public void returnChange(double change) {
		// TODO Auto-generated method stub
		int[] changearray = new int[5];
		changearray[0] = (int) (change / 20);
		change = change - changearray[0] * 20;
		changearray[1] = (int) change / 1;
		change = change - changearray[1] * 1;
		changearray[2] = (int) (change / 0.5);
		change = change - changearray[2] * 0.5;
		changearray[3] = (int) (change / 0.2);
		change = change - changearray[3] * 0.2;
		if ((Math.round(change * 100.0) / 100.0) == 0.1) {

			changearray[4] = 1;
		}
		for (int i = 0; i < changearray.length; i++) {
			System.out.println("change returned :" + coins[i] + " " + changearray[i]);

		}
	}

	@Override
	public boolean checkValidity(double money) {
		// TODO Auto-generated method stub
		boolean bool = false;
		if (money == 50 || money == 20) {
			bool = true;
		}
		return bool;
	}

	@Override
	public void insertMoney(double price) {
		// TODO Auto-generated method stub
		System.out.println("ENTER NOTES AMOUNT [ONLY ACCEPTS 20$ and 50$]");
		double money = scanner.nextDouble();
		if (checkValidity(money)) {
			if (money - price >= 0) {
				System.out.println("MONEY ACCEPTED.");
				returnChange((money - price));
			}
		}

	}

}
