package Encrypt_decrypt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Decrypt_data {
public static void main(String[] args) throws Exception {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
	PreparedStatement ps=con.prepareStatement("select * from aes");
	ResultSet e=ps.executeQuery();
	while(e.next()){
		System.out.println(e.getInt(1));
		System.out.println(e.getString(2));
		System.out.println(AES.decrypt(e.getString(3), "420"));
	}
	
	
}
}
