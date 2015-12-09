import java.sql.*;

import javax.swing.JOptionPane;

public class connectdb {
	
		Connection connect = null;
		
		public static Connection dbConnector(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connect =  DriverManager.getConnection("jdbc:mysql://localhost/java_mini_project" +
					"?user=root&password=");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			return connect;
		} 
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}

