package Perform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch_by_id {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		Statement st=con.createStatement();
		ResultSet y=st.executeQuery("select * from crud_operation where id=2");
		y.next();
		System.out.println(y.getInt(1));
		System.out.println(y.getString(2));
		System.out.println(y.getString(3));
		con.close();
		System.out.println("data fetched");
		System.out.println(y);
		}
}
