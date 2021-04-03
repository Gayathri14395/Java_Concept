package com.java.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapPrg {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String,Integer>();
		
		m.put("X", null);
		m.put("A", 1);
		m.put("B", null);
		m.put("C", null);
		m.put("D", 2);
		m.put("A", 3);
		m.put("F", 1);
		
		System.out.println(m);
		
		Object a = m.get("X");
		
		System.out.println(a);
		
		
Boolean c = m.containsKey("S");
		
		System.out.println(c);
		
		Object d = m.containsValue(null);
		
		System.out.println(d);
		
		Set<String> s = m.keySet();
		
		System.out.println(s);
		
		Collection<Integer> b = m.values();
		
		System.out.println(b);
		
		Set<Entry<String, Integer>> e = m.entrySet();
		System.out.println(e);
		
		for (Entry<String, Integer> entry : e) {
			
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
	}

}
