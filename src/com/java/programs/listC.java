package com.java.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class listC {

	public static void main(String[] args) {
		
		List<Object> l1 = new LinkedList<Object>();
				l1.add(10);
		l1.add(20);
		l1.add(10000000000l);
		l1.add(29.8f);
		l1.add("Jiya");
		l1.add("J");
		
		System.out.println("The list1 contains "+l1);
		
		List<Integer> l2 = new ArrayList<Integer>();		
		l2.add(null);
		l2.add(40);
		l2.add(10);
		l2.add(20);
		l2.add(null);
		l2.add(10);
		
		System.out.println("The list2 contains "+l2);
		
		l1.addAll(l2);		
		System.out.println("The new list is "+l1);
		
		int a = l1.size();		
		System.out.println("The length of the list is "+a);
		
		Object b = l1.get(4);		
		System.out.println("The value of the 4th index is "+b);
		
		l1.set(5, "Jamun");		
		System.out.println("After replacing "+l1);
		
		l1.remove(2);
		System.out.println("After removing "+l1);
		
		int c = l1.indexOf("Jiya");
		System.out.println("Index of Jiya is "+c);
		
		Boolean d = l1.contains(null);
		System.out.println("Null is present? "+d);
		
		Boolean e = l1.contains(1);
		System.out.println("Value 1 is present? "+e);
		
		boolean retainAll = l1.retainAll(l2);
		System.out.println(retainAll);
		
	}

}
