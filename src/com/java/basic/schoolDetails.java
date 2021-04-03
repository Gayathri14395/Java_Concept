package com.java.basic;

public class schoolDetails extends studDetails { // Method Overriding
	@Override
	public void studname() {
		
		super.studname();
	}
	
	public void mark() {
		
System.out.println("Mark is 90%");
	}
	public static void main(String[] args) {
		
		schoolDetails s = new schoolDetails();
		s.studname();s.mark();
	}
	
}
