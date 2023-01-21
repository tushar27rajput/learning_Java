package testJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("Jalgaon");
		al.add("Bhusawal");
		al.add("Dhule");
		
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
