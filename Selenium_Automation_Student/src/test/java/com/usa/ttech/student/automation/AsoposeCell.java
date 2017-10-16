package com.usa.ttech.student.automation;

import java.util.ArrayList;
import java.util.Collections;


public class AsoposeCell {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("C");
		animals.add("K");
		animals.add("N");
		animals.add("N");
		int C=Collections.frequency(animals, "C");
		
		System.out.println("Freq of bat: "+C);

	}

}
