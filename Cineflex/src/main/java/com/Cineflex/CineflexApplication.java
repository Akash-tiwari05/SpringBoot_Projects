package com.Cineflex;

import com.Cineflex.Cineflex.Self;
import com.Cineflex.Cineflex.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class CineflexApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("self")
	private User selfUser;

	@Autowired
	@Qualifier("spouse")
	private User spouseUser;

	public static void main(String[] args) {

		SpringApplication.run(CineflexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Cinemaxify Application");
		while (true) {
			System.out.println("Please select the member you want to the plan for:");
			System.out.println("1. Self \n2. Spouse");

			int userInput = sc.nextInt();

			String userType = "";
			sc.nextLine();
			User user = null;
			switch (userInput){
				case 1:
					user = selfUser;
					userType = "Self";
				break;
				case 2:
					user = spouseUser;
					userType = "Spouse";
				break;
				case 3:
					System.out.println("Existing Thank you for Visiting our Cinfelex");
					sc.close();
					return;
				default:
					System.out.println("Invalid Choice please try again!");
					return;
			}
			System.out.println("Please Select your name");
			System.out.println("1. Normal \n2.Premium \n3.");

			int planType = sc.nextInt();
			sc.nextLine();
			String myPlan = "";
			switch (planType){
				case 1: myPlan = "Normal";
				break;
				case 2: myPlan = "Premium";
				break;
				default:
					System.out.println("Invalid Choice! Please try again");
					return;

			}


			System.out.println("Please Enter Your Name: ");
			String name = sc.nextLine();

			System.out.println("Please Enter Your Age:");
			int age = sc.nextInt();

			System.out.println("Please enter your contact:");
			long contact = sc.nextLong();
			sc.nextLine();
			System.out.println("Please enter your address:");
			String address  = sc.nextLine();
			System.out.println();
			 // sc.nextLine();

			user.setUserDetails(name,age,contact,address);

			user.getUserDetails();
			System.out.println("You have selected a "+myPlan+ " for " +userType);
			System.out.println("Do you want to purchase plan For Someone else");
			System.out.println("1. Yes \n2. No");
			int input = sc.nextInt();
			if(input == 2) break;

		}
	}
}
