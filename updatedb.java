package java_project;

import java.sql.*;

public class updatedb {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/miniproject";
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
			String sql = "UPDATE user " 
					+ "SET name='hathirat',username='kaimouk',password='00001',privilege='admin' "
					+ "WHERE id_user=3";
			
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
