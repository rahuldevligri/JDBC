package com.jdbc.project;

import java.sql.*;
import java.io.*;

public class d_insetDataDynamicInput_PreparedStatement {
    public static void main(String[] args) {
        try {
            // load the Driver...
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create Connection..
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "4642";
            Connection con = DriverManager.getConnection(url, username, password);

            // create a dynamic query
            String q = "insert into table1(tName,tCity) values (?,?)";

            // get the PreparedStatement object...
            PreparedStatement pstmt = con.prepareStatement(q);

            // taking input from user using BufferReader class.....
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter City: ");
            String city = br.readLine();

            // set values to a query...
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();

            System.out.println("Insearted....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
