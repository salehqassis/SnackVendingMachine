package com.freightos.SnackVendingMachine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MachineInstance implements VendingMachine {
	ArrayList<Product> productList = new ArrayList<Product>();
	Scanner scanner = new Scanner(System.in);
	Payment payment;

	public void addProduct() {
		// row 1 A
		productList.add(new Product("A1", "lays original", 7, 1, 1));
		productList.add(new Product("A2", "mr chips", 7, 1, 2));
		productList.add(new Product("A3", "Cheetos ketchup", 7, 2, 3));
		productList.add(new Product("A4", "lays salt and venigar", 7, 1, 4));
		productList.add(new Product("A5", "Cheetos original", 7, 2, 5));

		// row 2 B
		productList.add(new Product("B1", "sneakers", 7, 1, 6));
		productList.add(new Product("B2", "sneakers white", 7, 1, 7));
		productList.add(new Product("B3", "M&Ms", 7, 2, 8));
		productList.add(new Product("B4", "flake", 7, 1, 9));
		productList.add(new Product("B5", "M&Ms peanuts", 7, 2, 10));

		// row 3 C

		productList.add(new Product("C1", "water", 7, 1, 11));
		productList.add(new Product("C2", "Sprite", 7, 2.5, 12));
		productList.add(new Product("C3", "Coca Cola", 7, 2.5, 13));
		productList.add(new Product("C4", "Sprite zero", 7, 2.5, 14));
		productList.add(new Product("C5", "Coca Cola zero", 7, 2.5, 15));

	}

	public void selectItem() {
		// TODO Auto-generated method stub
		System.out.println(" choose your snack !.");
		DisplayMenu();

		System.out.println("PLEASE ENTER LOCATION OF THE SNACK THAT YOU WANT. \nTO RETURN BACK PRESS B");
		String chosenItem = scanner.nextLine();

		switch (chosenItem.toUpperCase()) {
		// ROW A
		case "A1":
			if (productList.get(0).isAvailable()) {

				insertMoney(productList.get(0));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "A2":
			if (productList.get(1).isAvailable()) {

				insertMoney(productList.get(1));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "A3":
			if (productList.get(2).isAvailable()) {

				insertMoney(productList.get(2));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "A4":
			if (productList.get(3).isAvailable()) {

				insertMoney(productList.get(4));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "A5":
			if (productList.get(4).isAvailable()) {

				insertMoney(productList.get(4));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;

		// ROW B
		case "B1":
			if (productList.get(5).isAvailable()) {

				insertMoney(productList.get(5));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;

		case "B2":
			if (productList.get(6).isAvailable()) {

				insertMoney(productList.get(6));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "B3":
			if (productList.get(7).isAvailable()) {

				insertMoney(productList.get(7));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "B4":
			if (productList.get(8).isAvailable()) {

				insertMoney(productList.get(8));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "B5":
			if (productList.get(9).isAvailable()) {

				insertMoney(productList.get(9));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		// ROW C
		case "C1":
			if (productList.get(10).isAvailable()) {

				insertMoney(productList.get(10));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "C2":
			if (productList.get(11).isAvailable()) {

				insertMoney(productList.get(11));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "C3":
			if (productList.get(12).isAvailable()) {

				insertMoney(productList.get(12));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;
		case "C4":
				if (productList.get(13).isAvailable()) {

					insertMoney(productList.get(13));
				} else {
					System.out.println("NOT AVAILABLE.");
					System.out.println("-------------------------------------");
					break;
				}
				break;

		case "C5":
			if (productList.get(14).isAvailable()) {

				insertMoney(productList.get(0));
			} else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("-------------------------------------");
				break;
			}
			break;

	

		// QUIT
		case "B":
			DisplayMenu();
			break;
		// others
		default:
			System.out.println("INVALID LOCATION : (TRY AGAIN)");
			System.out.println("-------------------------------------");
			selectItem();
			break;
		}

	}

	public void insertMoney(Product item) {
		// TODO Auto-generated method stub

		System.out.println("       -----   PAYMENT METHOD   -----");
		System.out.println();
		System.out.println("PRESS 1 TO PAY IN COINS");
		System.out.println("PRESS 2 TO PAY WITH CARD");
		System.out.println("PRESS 3 TO PAY WITH NOTES");
		System.out.println("PRESS 4 TO CANCEL PURCHASE");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();

		int inputPayMethod = scanner.nextInt();

		switch (inputPayMethod) {
		case 1:
			payment = new coinPayment();
			payment.insertMoney(item.getPrice());
			dispenceItem(item);

			System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
			System.out.println("-------------------------------------");
			DisplayMenu();

			break;

		case 2:
			payment = new CardPayment();
			payment.insertMoney(item.getPrice());
			dispenceItem(item);

			System.out.println("SUCCESSFULLY PURCHASED " + item.getName());

			System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
			System.out.println("-------------------------------------");
			DisplayMenu();

			break;

		case 3:
			payment = new NotesPayment();
			payment.insertMoney(inputPayMethod);
			dispenceItem(item);
			System.out.println("SUCCESSFULLY PURCHASED " + item.getName());

			System.out.println("SUCCESSFULLY PURCHASED " + item.getName());

			System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
			System.out.println("-------------------------------------");
			DisplayMenu();

			break;

		case 4:
			DisplayMenu();
		default:
			System.out.println("INVALID INPUT");
		}

	}

	public void returnChange() {
		// TODO Auto-generated method stub

	}

	public void dispenceItem(Product item) {
		// TODO Auto-generated method stub
		productList.get(productList.indexOf(item))
				.setQuantity(productList.get(productList.indexOf(item)).getQuantity() - 1);

	}

	public void DisplayMenu() {
		
		// TODO Auto-generated method stub
		Iterator<Product> iterator = productList.iterator();
		System.out.println(" ----------------");
		while (iterator.hasNext()) {
			Product item = iterator.next();
			System.out.format("%-3s%-14s|\n", "|", item.getName());
			System.out.format("%-3s%-14s|\n", "|", item.getLocation());
			System.out.format("%-3s%-14f|\n", "|", item.getPrice());
			System.out.println(" ----------------");
		}
	}

}
