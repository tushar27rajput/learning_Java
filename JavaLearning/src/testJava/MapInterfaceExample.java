package testJava;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample 
{

	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Tushar", 32);
		map.put("Kalyani", 27);
		map.put("Jayesh", 25);
		map.put("Rujesh", 22);
		
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
