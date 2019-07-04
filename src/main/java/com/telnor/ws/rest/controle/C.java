package com.telnor.ws.rest.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C {
	private static final String URL = "";
	private static final String DRIVER = "";
	private static final String USER = "";
	private static final String PASS = "";
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
