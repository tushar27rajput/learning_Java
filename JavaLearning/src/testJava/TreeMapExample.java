package testJava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample 
{

	public static void main(String[] args) 
	{
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("Tushar", 100);
		tm.put("Kalyani", 101);
		tm.put("Jayesh", 102);
		tm.put("Rujesh", 103);
		
		Integer value = tm.get("Tushar");
		System.out.println("Value at key 100: " +value);
		
		tm.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
		
		
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
