package com.jdbc.project;

import java.sql.*;

import DAOLayer.ConnectionProvider;

public class h_selectDataInATable {
	public static void main(String...args) {
		try {
			//create connection
			Connection con = ConnectionProvider.getConnection();
			
			//create query
			String q ="select * from table1";
			
			//create statement
			Statement stmt = con.createStatement();
			
			//execute query
			ResultSet rs = stmt.executeQuery(q);
			
			while(rs.next()) {
				//set table data in variable... 
				int id = rs.getInt(1);//table column number
				String name = rs.getString("tName");//table column name
				String city = rs.getString(3);//table column number
				
				//print table data
				System.out.println(id+" : "+name+" : "+city);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
