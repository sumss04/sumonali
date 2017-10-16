package com.usa.ttech.student.automation;

public class Child extends Parent {
	
	void earning() {
		System.out.println("This is mu income");
	}
	static int balance() {
		System.out.println("This is mu income");
		return 0;
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.earning();
		
		Parent.salary();
		Child.salary();
		Child.balance();
		
	}
	

	
}
