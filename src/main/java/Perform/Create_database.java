package Perform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_database {
public static void main(String[] args) throws Exception  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement st=con.createStatement();
	boolean y=st.execute("create database cruduu");
	con.close();
	System.out.println("database created");
	System.out.println(y);
	}
}
