package com.amdocs.training.dbutil.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbUtil{
	private static Connection connection = null;

	private DbUtil() {
	}

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/myproject";
		String user = "root";
		String password = "mohdtalib";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection(url, user, password);
			}
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}
}


