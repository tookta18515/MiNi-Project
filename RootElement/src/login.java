import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;
	public static String sLevel;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//connect database
	String url = "jdbc:mysql://localhost/java_mini_project";
	String user = "root";
	String password = "";
	
	Connection connect = null;
	

	public login() {
		initialize();
		connect = connectdb.dbConnector();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username :");
		lblNewLabel.setBounds(35, 41, 78, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password :");
		lblNewLabel_1.setBounds(35, 84, 78, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		usernameField = new JTextField();
		usernameField.setBounds(123, 35, 140, 30);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnlogin = new JButton("login");
		btnlogin.addActionListener(new ActionListener() {
		
		//condition into page admin
		public void pageForm(){
			if(sLevel.equals("admin")){
				frame.dispose();
				Addinfo addin = new Addinfo();
				//addin.setVisible(true);
			}	
			else{
//				frame.dispose();
//				pageUser puser = new pageUser();
//				puser.setVisible(true);
				
			}
		}
		
		public void actionPerformed(ActionEvent arg0) {
			
				
				try{
					
					String query="select * from user where username=? and password=? ";
					PreparedStatement pst = connect.prepareStatement(query);
					pst.setString(1, usernameField.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs = pst.executeQuery();
					
					if(rs.next()) {
						sLevel = rs.getString("privilege");
						pageForm();
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect Username/Password");
					}
					
					rs.close();
					pst.close();
				} 
				catch (Exception e){
					JOptionPane.showMessageDialog(null, e);
					
				}
			}
			
		});
		
		btnlogin.setBounds(123, 135, 89, 35);
		frame.getContentPane().add(btnlogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 79, 140, 30);
		frame.getContentPane().add(passwordField);
		
	}
}
