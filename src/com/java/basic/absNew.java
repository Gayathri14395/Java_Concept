package com.java.basic;

import java.util.Scanner;

public class absNew extends absSample { // Abstract class
	
	@Override
	public void name() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = s.nextLine();
		System.out.println("Name is " +name);
		s.close();
		
	}

	public static void main(String[] args) {
		absNew an = new absNew();
		an.id();an.name();
		
		
	}

	
}
