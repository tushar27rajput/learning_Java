package testJava;

import java.io.IOException;

public class NotepadopenExample 
{

	public static void main(String[] args) 
	{
		Runtime rs = Runtime.getRuntime();

		try {
		    	rs.exec("notepad.exe");
		    	
		    } catch (IOException e) 
			{
		      e.printStackTrace();
		    }

	}

}

/*To open Notepad in a Java program, you can use the Runtime class's exec() method. 
 * Here is an example of how you can use this method to open Notepad on a Windows operating system:
 */