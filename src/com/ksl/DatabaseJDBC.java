package com.ksl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
		
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:xe", "hr" , "6793");
		
		
		
		String sql = "Select * from Employees";
		
		
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		
		while(executeQuery.next())
		{		
		
		
			String string = executeQuery.getString("EMAIL");

			System.out.println(string);
				
	}

		connection.close();
		
		
	}
}
