package vn.com.htc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDB {
	Connection conn;
	public Connection getDB() {
		String dbClass = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/ghepship_ss2";
		String username = "root";
		String password = "";
		try {
			Class.forName(dbClass);
			conn = DriverManager.getConnection(dbUrl,username,password);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
