package com.usa.ttech.oops;

class AccountDemo { 

public static void main(String[] args) { 

	CheckingAccount sa = new CheckingAccount(5000); 

System.out.println("account name: " + sa.getName()); 

System.out.println("initial amount: " + sa.getAmount()); sa.deposit(5000); 

System.out.println("new amount after deposit: " + sa.getAmount()); 

Saving_Account ca = new Saving_Account(20000); 

System.out.println("account name: " + ca.getName()); 

System.out.println("initial amount: " + ca.getAmount()); ca.deposit(6000);

 System.out.println("new amount after deposit: " + ca.getAmount()); ca.withdraw(3000); 

System.out.println("new amount after withdrawal: " + ca.getAmount()); } } 
