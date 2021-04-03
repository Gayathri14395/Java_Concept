package com.java.basic;

public class interfaceNew implements interfaceSample{

	@Override
	public void name() {
		System.out.println("Name is Jiya");
		
	}

	@Override
	public void number() {
		System.out.println("No. is 298");
		
	}

	public static void main(String[] args) {
		interfaceNew in = new interfaceNew();
		in.name();in.number();
	}
}

