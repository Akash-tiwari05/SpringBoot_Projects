package com.Tax.TAxApplication;

import com.Tax.TAxApplication.User.IncomeTax;
import com.Tax.TAxApplication.User.Tax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.Scanner;

@SpringBootApplication
public class TaxApplication implements CommandLineRunner {

	@Autowired
	private  Tax incomeTax;

	@Autowired
	private Tax propertyTax;

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(TaxApplication.class, args);
		//TaxApplication tax = ctx.getBean(TaxApplication.class);
		//tax.run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to the Tax Payment Application");
		System.out.println("Please select which tax you want to choose");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n Please select which tax you want to choose:");
			System.out.println("1. Income");
			System.out.println("2. Property");
			System.out.println("3. Exist");

			int userChoice = sc.nextInt();

			Tax tax = null;
			switch (userChoice) {
				case 1:
					tax = incomeTax;
					break;
				case 2:
					tax = propertyTax;
					break;
				case 3:
					System.out.println("Existing the Application Thank you");
					sc.close();
					return;
				default:
					System.out.println("Default Choice. Please try again.");
					continue;
			}
			//System.out.println("You have selected "+ tax.getTax);

			/*if(income.equals()){
				tax = income;
			} else if (property.equals()) {
				tax = property;
			}*/
			//Display the selected tax
			System.out.println("You have selected: " + tax.getTaxType());
			if(tax.isTaxPayed()){
				System.out.println("The "+ tax.getTaxType()+ " is already payed");
				continue;
			}
			System.out.println("Please enter your "+tax.getTaxType() + "value = ");
			double amount = sc.nextDouble();
			tax.setTaxableAmount(amount);//Set tax amount for Income or Property

			tax.calculateTaxAmount();
			System.out.println("You have selected  "+tax.getTaxType()+ " and your tax amount is = "+tax.getTaxAmount());

			//ask the user to pay tax or not
			System.out.println("Do you want to pay the tax? (Yes/No) ");
//	     	System.out.println("1.Yes");
//			System.out.println("2. No");

			sc.nextLine();
			String userInput = sc.nextLine();
			if ("Yes".equalsIgnoreCase(userInput)) {
				tax.payTax();  // Mark the tax as paid
				System.out.println("Tax payment confirmed. Thank you!");
			} else {
				System.out.println("Tax payment cancelled.");
			}

		}
	}
	/*private int getUserInput(Scanner sc) {
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			return -1; // Return an invalid choice to prompt retry
		}
	}

	private double getUserDoubleInput(Scanner sc) {
		try {
			return Double.parseDouble(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			return 0; // Default value
		}
	}*/
}
