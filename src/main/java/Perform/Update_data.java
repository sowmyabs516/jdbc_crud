package Perform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_data {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		Statement st=con.createStatement();
		int y=st.executeUpdate("update crud_operation set address='bannur' where id=2");
		con.close();
		System.out.println("data updated");
		System.out.println(y);
		}
}

