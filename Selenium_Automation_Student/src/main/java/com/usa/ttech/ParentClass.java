package com.usa.ttech;

public class ParentClass {

	   
		/*static void sum(int a){
			a=10;
			 System.out.println(a);
			
		
		      }*/
		     
	public static void sum() {
		System.out.println("this is sum method");
	}
	public void fire() {
		System.out.println("this is sum method");
	}
	
  public static void main(String[] args) {
	  ParentClass obj=new ParentClass();
	  obj.fire();
	  
	  ParentClass.sum();
			System.out.println("this is main");
		}
	
		  
}

