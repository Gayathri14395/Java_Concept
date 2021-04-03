package com.java.demo;



public class keyWords {
	int a = 30;
	//a++;// CV

	
	static  { // Static method will be exec before main
		System.out.println("Example method of static");
				}
	
	
	public void num() {
		int a = 10;
		a++;
		int b = 20; // LV
		final int c = 40; 		
		
		System.out.println("LV is" +b);
		System.out.println("Method's LV is" +a);
		System.out.println("CV is" +this.a);
		System.out.println("FV is" +c);
		//System.out.println("Inc value is " +d);
		System.out.println("CCV is "+studDetails1.c);

	}
	
	public static void main(String[] args) {
		keyWords k = new keyWords();
		k.num();
	}

}
