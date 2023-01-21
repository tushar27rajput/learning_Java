package testJava;

public class ThrowExceptionTest 
{
	static void validate(int age)
	{
		if(age<18)
		throw new ArithmeticException("not valid");
		else 
			System.out.println("Welcome to Jalgaon");
	}
	
	public static void main(String args[])
	{
		validate(13);
		System.out.println("reset of code...");
	}
	
}
