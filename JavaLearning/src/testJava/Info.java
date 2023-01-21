package testJava;

interface Info 
{
	static final String location = "Jalgaon";
	static final String location1 = "Pune";
	
	public void display();
}

class Simple implements Info
{
	public static void main(String args[])
	{
		Simple obj = new Simple();
		obj.display();
	}

	@Override
	public void display() 
	{
		System.out.println(location +" is my hometown");
		System.out.println(location1);
		
	}
	
}