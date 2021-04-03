package com.java.demo;


public class studDetails1 extends keyWords{
	 int b = 30;//Class  variable
	static int c = 40;//Static Variable
	int d;//Class variable if not initialised will take default value
		
		public void studname() {
			System.out.println("The student name is Jiya");
			int a = 20;//Local Variable must be initialised
			System.out.println(a);
			System.out.println("St="+b);
			System.out.println("PCV is" +super.a);// super keyword to access PCV

		}
		public static void main(String[] args) 
		{
			studDetails1 sd = new studDetails1();
			sd.studname();
			System.out.println(studDetails1.c);//As it is static variable should use Class name
			System.out.println(sd.b);//As it is class variable can use class object
			//System.orintln("St="+b);
			System.out.println(sd.d);//As it is class variable can use class object
		}
		}

