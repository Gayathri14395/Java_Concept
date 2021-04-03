package com.java.programs;

public class armstrongNo {

	public static void main(String[] args) {
		int a = 153;
		int n = a;
		int i, j=0;
		
		while (n>0) {
			i = n%10;
			j=j+(i*i*i);
			n=n/10;
					
		}
			if (a==j) {
				System.out.println( "The Value " +a+ " is an Armstrong no.");
			}
			else {
				System.out.println("NOt an Armstrong no.");	
			}
			
	}

}
