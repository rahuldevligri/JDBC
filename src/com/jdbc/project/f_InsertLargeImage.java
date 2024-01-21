package com.jdbc.project;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import DAOLayer.ConnectionProvider;

public class f_InsertLargeImage {
	public static void main(String...args)throws Exception {
		//try {
		
			Connection c = ConnectionProvider.getConnection();
			
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = c.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Success");
			c.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
