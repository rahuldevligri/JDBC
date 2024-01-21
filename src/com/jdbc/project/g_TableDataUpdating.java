package com.jdbc.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import DAOLayer.ConnectionProvider;

public class g_TableDataUpdating {
	public static void main(String...args)throws Exception{
		//create connection
		Connection con = ConnectionProvider.getConnection();
		
		//Create Query...
		String q ="update table1 set tName=?, tCity=? where tId=?";
		
		//taking input form user using BufferReader class
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter New Name: ");
		String name = br.readLine();
		System.out.print("Enter New City: ");
		String city = br.readLine();
		
		System.out.print("Enter Student ID: ");
		int id = Integer.parseInt(br.readLine());
		
		//put query
		PreparedStatement pstmt = con.prepareStatement(q);
		
		//putting values of ? mark
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.setInt(3,id);
	
		//fire query
		pstmt.executeUpdate();
		
		System.out.println("Updating Done...");
		System.out.println("ID \t Student Name \t City");
		System.out.println(id+" \t "+name+" \t "+city);
		//close connection 
		con.close();
	}
}
