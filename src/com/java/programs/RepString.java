package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepString {
	
	public static void main(String[] args) {
		String s = "of the people for the people by the people";
		
		String[] split =  s.split(" ");
		
		Map<Object, Integer> m = new HashMap<Object,Integer>();
		
		for(String word : split)
		{
			if (m.containsKey(word)) {
				Integer val = m.get(word);
				m.put(word, val+1);
			}
		
		else {
			m.put(word, 1);
			
		}
		
		//System.out.println(m);
			}
	
		Set<Entry<Object, Integer>> e = m.entrySet();
		for (Entry<Object, Integer> entry : e) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	
	
		}
	
}
