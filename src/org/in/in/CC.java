package org.in.in;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CC{
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String> li=new LinkedHashMap<>();
		li.put(10, "abc");
		li.put(20, "def");
		li.put(10, "abc");
		li.put(45, "xyz");
		
		
		System.out.println(li);
		
		System.out.println();
		
		Set<Integer> k = li.keySet();
		System.out.println(k);
		
		System.out.println();
		
		Collection<String> c = li.values();
		System.out.println(c);
		
		System.out.println();
		
		Set<Entry<Integer, String>> e = li.entrySet();
		for (Entry<Integer, String> en : e) {
			
			System.out.println(en);
			
			System.out.println();
			
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			
			System.out.println();
			
		}
		
	}
	
}