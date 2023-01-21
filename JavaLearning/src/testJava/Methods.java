package testJava;

public class Methods 
{
	Methods() // Constructor method
	{
		System.out.println("Constructor method is called when an object of it's class is created");
	}

	public static void main(String args[])// Main method where program execution begins
	{
		staticMethod();
		Methods obj = new Methods();
		obj.nonStaticMethod();
		
	}
	
	// Static Method
	
	static void staticMethod()
	{
		System.out.println("Static method can be called without creating object");

	}
	
	// Non-Static Method
	void nonStaticMethod()
	{
		 System.out.println("Non static method must be called by creating an object");

	}
}
