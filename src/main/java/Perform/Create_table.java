package Perform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_table {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		Statement st=con.createStatement();
		boolean y=st.execute("create table Crud_operation(id integer,name varchar(20),address varchar(25))");
		con.close();
		System.out.println("Table created");
		System.out.println(y);
		}
	}
