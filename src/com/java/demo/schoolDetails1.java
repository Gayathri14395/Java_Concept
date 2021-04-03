package com.java.demo;

import com.java.basic.studDetails;

	public class schoolDetails1 extends studDetails { // Method Overriding
		@Override
		public void studname() {
			
			super.studname();
		}
		
		public void mark() {
			
	System.out.println("Mark is 80%");
		}
		public void studname1() {
			System.out.println("The student name is Jiya");
			int a = 20;
			System.out.println(a);
			
		}
		public static void main(String[] args) {
			
			schoolDetails1 s = new schoolDetails1();
			s.studname();s.mark();s.studname1();
		}
		
	}



