/*
 * Enhance loop in java Program
 */
package testJava;

public class EnhancedForLoop 
{

	public static void main(String[] args) 
	{
		 int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		 for (int t: primes) 
		 {
			 System.out.println(t);
		 }
		 
		 String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
		 for (String sample: languages) 
		 {
			 System.out.println(sample);
		 }


	}

}
