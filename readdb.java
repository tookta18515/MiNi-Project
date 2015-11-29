package java_project;

import java.sql.*;


public class readdb {

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
			String sql = "SELECT * FROM user WHERE id_user";
			
			ResultSet rec = stmt.executeQuery(sql);
            
			while((rec!=null) && (rec.next()))
            {
                System.out.print(rec.getInt("id_user"));
                System.out.print(" - ");
                System.out.print(rec.getString("name"));
                System.out.print(" - ");
                System.out.print(rec.getString("username"));
                System.out.print(" - ");
                System.out.print(rec.getString("password"));
                System.out.print(" - ");
                System.out.print(rec.getString("privilege"));
                System.out.print("\n");
               
            }
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Close
		try {
			stmt.close();
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
