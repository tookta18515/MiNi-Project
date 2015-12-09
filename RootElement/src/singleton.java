import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class singleton {
	private static singleton instance = null;
	
	private static singleton singleton(){
		if(instance == null){
			instance = new singleton();
		}
		return instance;
	}
	public static void login (){
		login.main(null);
		
	}
}