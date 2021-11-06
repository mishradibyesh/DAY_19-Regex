package com.regex;

import java.util.Scanner;

public class UserRegistrationFunctionality {
	Scanner scanner = new Scanner(System.in);
	UserRegFormValidation validation = new UserRegFormValidation();

	// method to take input and call firstname method
	public void userFirstName() {
		System.out.println("Enter Your First Name : ");
		String firstName = scanner.next();
		validation.firstName(firstName);
	}
	// method to take last name and call lastname method
	public void userLastName() {
		System.out.println("Enter Your Last Name : ");
		String lastName = scanner.next();
		validation.lastName(lastName);
	}
	//method for email validation
	public void userEmailId() {
		System.out.println("Enter Your EmailId : ");
		String emailId = scanner.next();
		validation.emailId(emailId);
	}
	public void userMobileNumber() {
		System.out.println("Enter Your Mobile number : ");
		String mobile = scanner.next();
		validation.mobileNumber(mobile);
	}
	
	//method for password validation
	public void userPassword() {
        System.out.println("Enter your Password");
        String password = scanner.next();
        validation.password(password);
    }
}
