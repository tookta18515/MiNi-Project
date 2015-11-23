package java_project;

import java.sql.*;

public class connectdb {

	public static void main(String[] args) {

		Connection connect = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connect =  DriverManager.getConnection("jdbc:mysql://localhost/miniproject" +
					"?user=root&password=");

			if(connect != null){
				System.out.println("Database Connected.");
			} 
			else {
				System.out.println("Database Connect Failed.");
			}
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Close
		try {
			if(connect != null){
				connect.close();
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
