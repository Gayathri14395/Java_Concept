package com.java.basic;

public class empDetails {		// Method Overloading
public static void employee(int id) {
	
System.out.println("Employee id is "+id);
}
public static void employee(String name) {
	System.out.println("Employee name is "+name);

}
public static void main(String[] args) {
	
//empDetails e = new empDetails();
employee(298);
employee("Jiya");

}
}
