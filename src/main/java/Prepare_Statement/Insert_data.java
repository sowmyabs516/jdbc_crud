package Prepare_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_data {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		PreparedStatement ps=con.prepareStatement("insert into crud_prepare values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		ps.setInt(1, sc.nextInt());
		System.out.println("Enter name");
		ps.setString(2, sc.next());
		System.out.println("Enter address");
		ps.setString(3, sc.next());
		System.out.println("data inserted");
		ps.executeUpdate();
		con.close();
		}
	}
