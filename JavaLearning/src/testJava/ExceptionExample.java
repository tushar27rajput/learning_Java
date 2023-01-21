package testJava;

public class ExceptionExample 
{

	public static void main(String[] args) 
	{
		try
		{
			int a = 10/0;
			
		}catch (ArithmeticException e)
		{
			System.out.println("Error : " +e.getMessage());
		}
		finally 
		{
			System.out.println("This block is always executed.");
		}
		

	}

}

/*
 * In this example, the try block contains the code that might throw an exception (dividing by zero).
 *  If an exception is thrown, the catch block will execute and print the error message. 
 * The finally block will always execute, whether an exception is thrown or not.
 */
