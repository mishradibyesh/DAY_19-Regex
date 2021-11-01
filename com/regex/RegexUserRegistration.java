package com.regex;

import java.util.Scanner;

public class RegexUserRegistration {
	UserDetailsValidation validate = new UserDetailsValidation();
	Scanner sc = new Scanner(System.in);
	
	public void userFirstName() {
		System.out.println("Please Enter your first name ");
		String firstName = sc.next();
		validate.firstName(firstName);
		}
}
