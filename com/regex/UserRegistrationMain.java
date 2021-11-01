package com.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	UserRegistrationFunctionality regexUserRegistration = new UserRegistrationFunctionality();
	Scanner scanner = new Scanner(System.in);

	public void choice() {
		while (true) {
			System.out.println("Enter 1 To Check First Name\n"
					+ "Enter 0 To Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 :
				regexUserRegistration.userFirstName();
				break;
			case 0:
				System.exit(0);
				break;
			default :
				System.out.println("Enter the wrong input \n Please enter the Correct input");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("\n Welcome to the User Registration program by Regex \n");
		UserRegistrationMain regexUserMain = new UserRegistrationMain();
		regexUserMain.choice();
		regexUserMain.scanner.close();
	}
}
