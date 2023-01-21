/*
 * Print prime no Program in java
 */

package testJava;

import java.util.Scanner;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		int j , x, flag = 0;
		
		System.out.println("Enter any number: ");
		
		Scanner s = new Scanner(System.in);
		
		x = s.nextInt();
		
		for(j = 2; j < x; j++)
		{
			if(x % j == 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
				
			}
		}
		if(flag == 1 )
		{
			System.out.println("The "+x+" is a prime number");
		}
		else
		{
			System.out.println("The "+x+" is not prime number");
		}

	}

}
