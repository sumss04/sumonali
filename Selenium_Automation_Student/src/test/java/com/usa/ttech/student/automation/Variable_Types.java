package com.usa.ttech.student.automation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class Variable_Types {
	
	static int myAccountBalance;

	public static void main(String[] args) {
		myAccountBalance=500;
	
	
	if (myAccountBalance > 100 & myAccountBalance < 1000  ) {
		System.out.println(  "You dont have enough money");
	}
	else if (myAccountBalance > 1000 & myAccountBalance < 10000) {
		System.out.println("You have good money");
	}
	else if (myAccountBalance > 10000) {
		System.out.println( " You really have good savings");
	}

	
	else{
		System.out.println( "You have very poor money");
	}

	}
}

	
	
