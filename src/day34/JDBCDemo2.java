package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*1) Create a connection
2) Create statement/Query
3) Execute statement/Query
4) Capture results and print
5) close connection
*/


public class JDBCDemo2 {

	public static void main(String[] args) throws SQLException {
	
		//1) Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//2 & 3) Create statement/Query & Execute
		Statement stmt=con.createStatement();
		
		String select_query="select * from location";
		
		//4) Capture results and print
		ResultSet rs=stmt.executeQuery(select_query);
		
		while(rs.next())
		{
			String mycity=rs.getString("city");
			String mycountry=rs.getString("country");
			int mypin=rs.getInt("pin");
			
			System.out.println(mycity+"     "+mycountry+"     "+mypin);
		}
		
		
		//5) close connection
		rs.close();
		con.close();
		
		System.out.println("Done!!!");
		
	}

}
