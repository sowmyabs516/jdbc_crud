package Prepare_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_record {
	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
		PreparedStatement ps=con.prepareStatement("update crud_prepare set address=? where id=?");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter address");
		ps.setString(1, sc.next());
		System.out.println("Enter id");
		ps.setInt(2, sc.nextInt());
		ps.executeUpdate();
		System.out.println("data updated");
		con.close();
		}
}
