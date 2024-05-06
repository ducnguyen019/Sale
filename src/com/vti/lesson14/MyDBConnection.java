package com.vti.lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDBConnection {

	public static Connection getConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("config/config.properties"));
		} catch (IOException e1) {
			System.err.println(e1);
		}

		Connection conn = null;

		try {
			String dbUrl = prop.getProperty("dbUrl");
			String user = prop.getProperty("user");
			String pwd = prop.getProperty("pwd");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, user, pwd);
		} catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		return conn;
	}

	public static void main(String[] args) {
//		System.out.println(MyDBConnection.getConnection());
		Connection conn = MyDBConnection.getConnection();
		if (conn != null) {
			System.out.println("Connection Success !!!");
		} else {
			System.out.println("Connection failed !!!");
		}
	}

}
