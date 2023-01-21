package testJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImageJDBC 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO Tutorial(Name, Type, Logo) VALUES (?, ?, ?)");
		pstmt.setString(1, "Tushar");
		pstmt.setInt(2, 101);
		FileInputStream fin = new FileInputStream("D:\\test.jpg");
		pstmt.setBinaryStream(3, fin,fin.available());
		int i=pstmt.executeUpdate();
		System.out.println(i+" record affected");
		con.close();
	}

}
