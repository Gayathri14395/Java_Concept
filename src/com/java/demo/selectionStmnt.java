package com.java.demo;

public class selectionStmnt {
public static void main(String[] args) {
	int a = 5;
	String b = "*";
	
	if (a==6 && b=="*") {
System.out.println("True");
	}
	else if (a==6 || b=="*") {
	System.out.println(b);
	}
	
	else {
		System.out.println("Invalid");
	}
	
}
}
