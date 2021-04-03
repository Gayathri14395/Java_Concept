package com.java.basic;

public class vehicle { //  Constructors

	public vehicle() { //Default
		System.out.println("Executes automatically when object created");
	}
	
	public vehicle(int no) // Parametrized
	{
		System.out.println("Vehicle no. is "+no );
	}
	
	public void vehiname() {
	System.out.println("Name of the vehicle is Hero Maestro Edge");

	}
	public static void main(String[] args) {
		vehicle vn = new vehicle();
		vehicle v = new vehicle(8591);
						v.vehiname();vn.vehiname();
	}
}
