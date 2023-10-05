package Perform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_data {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		Statement st=con.createStatement();
		int y=st.executeUpdate("insert into crud_operation values(2,'sudeep','bennur')");
		con.close();
		System.out.println("data inserted");
		System.out.println(y);
		}
	}
