package com.java.programs;

public class stringRev {

	public static void main(String[] args) {
		int i;
		String s = "Jiya";
		String rev="";
		for(i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Original string is " +s);
		System.out.println("Reversed string is " +rev);
	}

}
