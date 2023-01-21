package testJava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureJDBC 
{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		String sql_string = "insert into student values(?,?)";
		CallableStatement stmt = con.prepareCall(sql_string);
		stmt.setInt(1, 102);
		stmt.setString(2, "Kalyani");
		stmt.execute();
		System.out.println("Successfully");
	}

}
