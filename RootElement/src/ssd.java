import java.awt.Container;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ssd {

	public ssd(){
	
	try{
		String url = "jdbc:mysql://localhost/java_mini_project";
		String user = "root";
		String password = "";
		Connection connect = null;
		Statement stmt = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		connect =  (Connection) DriverManager.getConnection(url, user, password);
		stmt = (Statement) connect.createStatement();
		String sql = "SELECT * FROM user WHERE id_user where name = name";
		ResultSet rec = stmt.executeQuery(sql);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(92, 23, 100, 20);
		Container contentPane=null;
		contentPane.add(comboBox);
		
		while(rec.next())
        {
			String name = rec.getString("name");
			comboBox.addItem(name);
        }
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
	}

}
}
