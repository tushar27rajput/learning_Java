/*
 * How to get Using input using Scanner Program in java
 */
package testJava;

import java.util.Scanner;

public class GetInputFromUser 
{

	public static void main(String[] args) 
	{
		int a;
		float f;
		String s;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string ");
		s = in.nextLine();
		System.out.println("You entered string : " +s);
		
		System.out.println("Enter a integer");
		a = in.nextInt();
		System.out.println("You entered integer : "+a);

		System.out.println("Enter a float");
		f = in.nextFloat();
		System.out.println("You entered float : "+f);
		
		
	}

}
