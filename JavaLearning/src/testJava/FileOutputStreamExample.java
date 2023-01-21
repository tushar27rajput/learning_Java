package testJava;

import java.io.FileOutputStream;

public class FileOutputStreamExample 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream("D:\\SWD\\TestFile.txt");
			fout.write(1);
			fout.close();
			System.out.println("Hello World");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
