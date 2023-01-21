package testJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Xiomi");
		hs.add("Nokia");
		hs.add("Realme");
		hs.add("Oneplus");
		hs.add("Sony");
		
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
