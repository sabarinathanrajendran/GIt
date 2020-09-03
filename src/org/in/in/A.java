package org.in.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {

	public static void main(String[] args)
	{
		//ArrayList<Employee>li=new ArrayList<Employee>();
		//Set<Employee>li=new LinkedHashSet<Employee>();
		HashMap<Integer,Employee>li=new HashMap<Integer,Employee>();
		Employee b=new Employee();
		b.setId(15);
		b.setName("greens");
		b.setPhno(956680);
		
		Employee b1=new Employee();
		b.setId(15);
		b.setName("qwer");
		b.setPhno(95);
		li.put(1,b);
		li.put(2,b1);
		
		
		//for(Employee x:li)
		{
			//System.out.println("emp details:"+x.getId());
		//	System.out.println("emp details:"+x.getName());
            // System.out.println("emp details:"+x.getPhno());
			
		}
		
	Set<Entry<Integer, Employee>> d = li.entrySet();
		
	for(Entry<Integer, Employee> x:d)
	{
		System.out.println(x.getKey());
		System.out.println(x.getValue().getId());
		System.out.println(x.getValue().getName());
		System.out.println(x.getValue().getPhno());
		
		System.out.println();
		
	}

	}

}