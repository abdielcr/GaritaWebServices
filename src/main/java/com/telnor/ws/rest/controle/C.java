package com.telnor.ws.rest.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C {
	private static final String URL = "jdbc:oracle:thin:@//10.205.49.30:1521/ORACLEDB";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER = "EXPERIENCIATDA";
	private static final String PASS = "experienciatda2018";
	private static Connection con;
	
	public static Connection cb() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASS);
		return con;
	}
	
	public static void db() {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
