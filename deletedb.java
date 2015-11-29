package java_project;

import java.sql.*;

public class deletedb {

public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/java_db";
		String user = "root";
		String password = "";
		
		Connection connect = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//1. Get a connection to database
			connect =  DriverManager.getConnection(url, user, password);

			// 2. Create a statement
			stmt = connect.createStatement();
				
			// 3. Execute SQL query
			String sql = "UPDATE member " 
					+ "SET "
					+ "WHERE member_id=";
			
			stmt.execute(sql);
                        						
			System.out.println("Updated Successfully");			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			stmt.close();
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
