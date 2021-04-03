package com.java.basic;

public class teacherDetails extends studDetails{ // Simple Inheritence
public void subid() {
	System.out.println("Subject id is 298");

}
public void subname() {
	System.out.println("Name of the subject is Maths");

}
public static void main(String[] args) {
	teacherDetails td = new teacherDetails();
	td.subid();td.subname();td.studname();
}
}


