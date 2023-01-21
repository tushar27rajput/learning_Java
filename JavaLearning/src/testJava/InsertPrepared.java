package testJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepared 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?)");
		
		pstmt.setInt(1, 104);
		pstmt.setString(2, "Rujesh");
		int i = pstmt.executeUpdate();
		System.out.println(i+ "record inserted ");
		con.close();
		
	
		

	}

}
