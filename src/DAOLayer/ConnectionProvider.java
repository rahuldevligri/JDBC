package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "4642";
		
		try {
			if(con==null) {
				// load Driver...
				Class.forName("com.mysql.jdbc.Driver");
				
				// create Connection...
				con=DriverManager.getConnection(url,username,password);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
