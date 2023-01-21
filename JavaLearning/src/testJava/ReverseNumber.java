/*
 * Print Reverse number in java program
 */
package testJava;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		int n , rev = 0;
		
		System.out.println("Enter a number: ");
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		while(n != 0)
		{
			rev = rev*10;
			//System.out.println(rev);
			rev = rev + n%10;
			//System.out.println(rev);
			n = n/10;
			
			
		}
		System.out.println("Reverse of entered number is " +rev);

	}

}
