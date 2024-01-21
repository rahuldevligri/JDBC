package com.jdbc.project;

import java.sql.*;

import DAOLayer.ConnectionProvider;
public class a_FirstJDBC {
    public static void main(String[] args) throws Exception{
  
        	// create Connection...
            Connection c = ConnectionProvider.getConnection();
            
            //check connection...
            if(c.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created....");
            }
            c.close();
    }
}
