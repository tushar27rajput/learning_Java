package testJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Jalgaon", 425001);
		lhm.put("Mumbai", 400001);
		lhm.put("Nagpur", 400012);
		
		System.out.println(lhm);
		
		for(Map.Entry m:lhm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
