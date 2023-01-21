/*
 * How to split string in java Program
 * In Java, the split() method of the String class can be used to split a string into an array of substrings based on a specified delimiter. 
 * Here is an example of how to use the split() method to split a string by a comma:
 */


package testJava;

public class SplitExample 
{
	public static void main(String args[])
	{ 
		String s1="java string split method by Technolamror"; 
		String[] words=s1.split("\\s");//splits the string based on whitespace 
		
		//using java foreach loop to print elements of string array 
		for(String w:words)
		{ 
			System.out.println(w); 
		} 
		
		
		String input = "apple,banana,cherry";
		String[] fruits = input.split(",");
		for(String f:fruits)
		{ 
			System.out.println(f); 
		} 
		
	}

}
