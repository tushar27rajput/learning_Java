package testJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("tushar");
		ts.add("Kalyani");
		ts.add("Jayesh");
		ts.add("Rujesh");
		ts.add("Mansi");
		ts.add("Sakshi");
		
		System.out.println(ts);
		
		Iterator<String>itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
	
	

}
