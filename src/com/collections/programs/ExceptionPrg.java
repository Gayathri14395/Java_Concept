package com.collections.programs;

public class ExceptionPrg {
public static void main(String[] args) {
	int a = 100;
	/*System.out.println(a/0);
	System.out.println("Exception");
*/
		
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception");
	}
} 
}
