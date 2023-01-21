package testJava;

public class ConstructorExample 
{
	String name;
	
	ConstructorExample()
	{
		System.out.println("Constructor method called.");
	}
	
	ConstructorExample(String t)
	{
		name=t;
		
	}
	
	public static void main(String args[])
	{
		ConstructorExample cpp = new ConstructorExample();
		ConstructorExample java = new ConstructorExample("java");
		
		cpp.setName("C++");
		
		java.getName();
		cpp.getName();
		
		
	}
	
	void setName(String t)
	{
		name = t;
	}
	
	void getName()
	{
		System.out.println("Language Name: " +name);
	}
	
}
