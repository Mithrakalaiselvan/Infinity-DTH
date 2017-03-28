package com.tcs.ilp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	private static String driver="oracle.jdbc.OracleDriver";
	private static String username="PJ02TEST_TJA183";
	private static String passwd="tcstvm";
	private static String url="jdbc:oracle:thin:@intvmoradb02:1521:ORAJAVADB";
	
	public static Connection getConection(){
		 Connection con=null;
		 try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,passwd);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return con;
		 
	}
	
	public static void closeConnection(Connection con){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void closeStatement(PreparedStatement pst){
		if(pst!=null){
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
