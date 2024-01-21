package com.jdbc.project;

import java.sql.*;

import DAOLayer.ConnectionProvider;

import java.io.*;

public class e_Insert_Image_in_DataBase {
    public static void main(String[] args)throws Exception {
//        try {
//            // load Driver...
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // create Connection...
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "4642");

    	    // create Connection...
            Connection c = ConnectionProvider.getConnection();
            
            // create a Query
            String q = "insert into images(pic) values(?)";

            //PreparedStatement pstmt = con.prepareStatement(q);
            PreparedStatement pstmt = c.prepareStatement(q);

            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\DELL\\eclipse-workspace\\JDBC\\src\\com\\jdbc\\project\\rahul.jpeg");

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Done.....");
            c.close();

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}

