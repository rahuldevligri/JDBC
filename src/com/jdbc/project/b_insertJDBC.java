package com.jdbc.project;

import java.sql.*;

import DAOLayer.ConnectionProvider;
public class b_insertJDBC {
    public static void main(String[] args)throws Exception{
 
        	// create Connection...
            Connection c = ConnectionProvider.getConnection();

            //create a Query...
            String q="create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            //Create Statement
            Statement stmt=c.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in DataBase...");
            c.close();
    }
}
