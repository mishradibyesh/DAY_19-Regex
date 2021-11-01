package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {

	public String regex ;
    // method to validate first name of user
	public void firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.matches()){
			System.out.println("VALID !");
		}
		else
		{
			System.out.println("NOT VALID !");
		}
	}

}
