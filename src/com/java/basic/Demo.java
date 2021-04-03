package com.java.basic;

import java.util.Scanner;

public class Demo {		//Scanner class - For getting input from user at runtime
	public static void main(String[] args) 
		
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance");
		String sen = sc.nextLine();
		System.out.println("The entered sentance is "+sen);
		
		System.out.println("Enter a number");
		int in = sc.nextInt();
		System.out.println("The entered number is "+in);
		sc.close();
		
	}

}
