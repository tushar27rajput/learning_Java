package testJava;

import java.sql.Date;

public class StringToSQLDateExample 
{

	public static void main(String[] args) 
	{
		 String str="2015-03-31"; 
		 Date date=Date.valueOf(str);//converting string into sql date 
		 System.out.println(date); 

	}

}
