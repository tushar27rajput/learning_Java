package testJava;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		StringBuffer a = new StringBuffer("Tushar");
		System.out.println(a.reverse());
		
		String orginal , rev="";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse");
		orginal = in.nextLine();
		
		int leng = orginal.length();
		
		System.out.println(leng);
		
		for(int i = leng-1; i >=0; i-- )
		{
			rev = rev + orginal.charAt(i);
			
			System.out.println("Reverse of entered string is: " +rev);
		}
		System.out.println("Reverse of entered string is: " +rev);

	}

}
