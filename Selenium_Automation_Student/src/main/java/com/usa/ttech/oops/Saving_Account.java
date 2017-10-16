package com.usa.ttech.oops;

class Saving_Account extends Account {

	 Saving_Account(long amount) {

	 super("Saving", amount); 
	}

	 void withdraw(long amount) { 

	setAmount(getAmount() - amount); 

	}
	 } 

