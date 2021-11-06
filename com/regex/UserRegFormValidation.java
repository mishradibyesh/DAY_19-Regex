package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegFormValidation {
	public String regex;

	//method for validation of user first name using regex
	public void firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("Valid !");
		} else {
			System.out.println("InValid !");
		}
	}

	//method for validation of user last name using regex
	public void lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}

	//method for validation of user Email using regex
	public void emailId(String emailId) {
		regex = "^[a-zA-Z0-9]+([.][0-9a-zA-z]+)*@[a-z]+.[a-z]{2,3}$";
		Pattern pattern  = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}
	
	//method for validation of user mobile number using regex
	public void mobileNumber(String mobileNumber) {
        regex = "^[0-9]{1,2}-[0-9]{10}$";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
}
