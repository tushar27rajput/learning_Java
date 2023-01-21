package testJava;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 
{

	public static void main(String[] args) 
	{
		// Create a new Hashtable
	    Hashtable<String, Integer> ht = new Hashtable<>();
	    
	   // Add key-value pairs to the Hashtable
	   
	    ht.put("Apple", 25);
	    ht.put("Banana", 30);
	    ht.put("Cherry", 35);
	    ht.put("Oragne", 40);
	    
	    
	    
	 // Get the value for a specific key
	    int value = ht.get("Banana");
	    System.out.println("Banana: " + value);
	    
	 // Remove a key-value pair
	    ht.remove("Cherry");
	    
	 // Check if a key is in the Hashtable
	    boolean containsKey = ht.containsKey("Apple");
	    System.out.println("Contains key 'Apple' : " +containsKey);

	    for(Map.Entry m:ht.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
	}

}
