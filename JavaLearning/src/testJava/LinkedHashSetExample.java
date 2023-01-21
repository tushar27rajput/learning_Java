package testJava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Jalgaon");
		lhs.add("Mumbai");
		lhs.add("Nagpur");
		lhs.add("Pune");
		
		System.out.println(lhs);
		
		Iterator<String> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
				

	}

}
