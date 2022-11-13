package com.freightos.SnackVendingMachine.payment;

import java.util.Scanner;

public class CoinPayment implements Payment {
	Scanner scanner = new Scanner(System.in);
	double credit = 0;
String coins[]= {"20USD","1USD","0.5USD","0.2USD","0.1USD"};
	@Override
	public boolean checkValidity(double money) {
		// TODO Auto-generated method stub
		boolean bool = false;
		if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1) {
			bool = true;
		}

		return bool;
	}

	@Override
	//take money from user
	public void insertMoney(double price) {
		// TODO Auto-generated method stub
		double money;
		System.out.println("Enter the number of coins you want to pay with.");
		double numberOfCoins = scanner.nextDouble();
		System.out.println("Enter the coins :[0.1, 0.2, 0.5, 1]");
		for (int i = 0; i < numberOfCoins; i++) {
			money = scanner.nextDouble();
			if (checkValidity(money)) { //check coins values
				credit = credit + money;
				System.out.println("credit"+ credit);
				System.out.println(price);
			}else {
				System.err.println("enter a valid coin");
				i-=1;
			}
				
		} 
		
		if (credit>=price) {
		
			returnChange(credit-price);
		}else {
			System.err.println("not enogh coins opperation failed");
		}
		
	}

	@Override
	public void returnChange(double change) {
		int[] changearray=new int[5];
		// TODO Auto-generated method stub
		//should check for change if exists to return to the customer 
		//if the machine doesn't have change it should return the paid coins to the user and cancel his order
		changearray[0] = (int) (change/20);
		change = change - changearray[0]*20;
		changearray[1] = (int)change/1;
		change = change - changearray[1]*1;
		changearray[2] = (int) (change/0.5);
		change = change - changearray[2]*0.5;
		changearray[3] = (int) (change/0.2);
		change = change - changearray[3]*0.2;	
		if(( Math.round(change * 100.0) / 100.0)==0.1) {
			
			changearray[4] = 1;
		}
		for (int i = 0; i < changearray.length; i++) {
			System.out.println("change returned :"+ coins[i]+" "+ changearray[i] );//return change how many from each coin 
			
		}

	}



}
