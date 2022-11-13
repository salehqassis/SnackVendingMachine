package com.freightos.SnackVendingMachine;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardPayment implements Payment {
	Scanner scanner = new Scanner(System.in);
	String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" + "(?<mastercard>5[1-5][0-9]{14})|"
			+ "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" + "(?<amex>3[47][0-9]{13})|"
			+ "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" + "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
	Pattern pattern = Pattern.compile(regex);

	@Override
	public void returnChange(double change) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkValidity(double price) {
		// TODO Auto-generated method stub
	//	should check credit card and if it contains the money here
		return true;
	}

	@Override
	public void insertMoney(double price) {
		// TODO Auto-generated method stub
		System.out.println("ENTER VALID CARD NUMBER");
		String CardNumber = scanner.nextLine();
		CardNumber = CardNumber.replaceAll("-", "");
		  Matcher matcher = pattern.matcher(CardNumber);
		
		System.out.println("VALIDATING CARD...");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  if (matcher.matches()) {
				System.out.println("valid");
			}
		  checkValidity(price);
		  
	}

}
