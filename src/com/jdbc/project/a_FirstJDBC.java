package com.jdbc.project;

import java.sql.*;
public class a_FirstJDBC {
    public static void main(String[] args){
        try{
            //load the driver...
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a  connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "4642";

            Connection con = DriverManager.getConnection(url,username,password);
            
            //check connection...
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created....");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
