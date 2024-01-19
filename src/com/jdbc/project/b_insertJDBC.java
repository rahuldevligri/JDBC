package com.jdbc.project;

import java.sql.*;
public class b_insertJDBC {
    public static void main(String[] args){
        try{
            //load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection...
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="4642";
            Connection con = DriverManager.getConnection(url,username,password);

            //create a Query...
            String q="create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            //Create Statement
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in DataBase...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
