package com.regex;

import java.util.Scanner;

public class UserRegistrationFunctionality {
	Scanner scanner = new Scanner(System.in);
	UserRegFormValidation userDetails = new UserRegFormValidation();

	public void userFirstName() {
		System.out.println("Enter Your First Name : ");
		String firstName = scanner.next();
		userDetails.firstName(firstName);
	}
}
