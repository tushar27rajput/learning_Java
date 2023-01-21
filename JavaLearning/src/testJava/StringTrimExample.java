/*
 * How to remove space in string both end in java Program
 */

package testJava;

public class StringTrimExample 
{

	public static void main(String[] args) 
	{
		String s1 = "     Hello Jalgaon     ";
		
		System.out.println(s1+"Welcome");//without trim()
		
		System.out.println(s1.trim()+"Welcome"); //with trim()
	}

}
