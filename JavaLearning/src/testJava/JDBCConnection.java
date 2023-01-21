package testJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//step2 create the connection object
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//step3 create the statement object 
		Statement stmt = con.createStatement();
		//step4 execute query 
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		//step5 close the connection 
		con.close();

	}

}
