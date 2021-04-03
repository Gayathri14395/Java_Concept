package com.java.programs;

public class palindromeNo {

	public static void main(String[] args) {
		int a = 12321;
		int n = a;
		int i, j=0;
		
		while (n>0) {
			i = n%10;
			j=(j*10)+i;
			n=n/10;
					
		}
			if (a==j) {
				System.out.println( "The Value " +a+ " is a Palindrome no.");
			}
			else {
				System.out.println("Not a Palindrome no.");	
			}

	}

}
