import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;

public class show extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show frame = new show();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		

		String url = "jdbc:mysql://localhost/java_mini_project";
		String user = "root";
		String password = "";
		
		Connection connect = null;
		Statement stmt = null;

		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//1. Get a connection to database
			connect =  (Connection) DriverManager.getConnection(url, user, password);

			// 2. Create a statement
			stmt = (Statement) connect.createStatement();
				
			// 3. Execute SQL query
			String sql = "SELECT * FROM user WHERE id_user where name = name";
			
			ResultSet rec = stmt.executeQuery(sql);
		/*	String bp = rec.getString("bp");
			System.out.println(bp);*/
			
            
			while(rec.next())
            {
				String bp = rec.getString("bp");
				System.out.println(bp);
				System.out.println("**********");
				String fbs = rec.getString("fbs");
				System.out.println(fbs);
			
				
				/*System.out.print(rec.getInt("id_user"));
                System.out.print(" - ");
                System.out.print(rec.getString("name"));
                System.out.print(" - ");
                System.out.print(rec.getString("bp"));
                System.out.print(" - ");
                System.out.print(rec.getString("fbs"));
                System.out.print(" - ");
                System.out.print(rec.getString("chro"));
                System.out.print(" - ");
                System.out.print(rec.getString("isc"));
                System.out.print(" - ");
                System.out.print(rec.getString("nec"));
                System.out.print(" - ");
                System.out.print(rec.getString("par"));
                System.out.print(" - ");
                System.out.print(rec.getString("bli"));
                System.out.print("\n");*/
               
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
	
	

	/**
	 * Create the frame.
	 */
	public show() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Status", TitledBorder.LEFT,
						TitledBorder.TOP, null, Color.BLACK));
		label.setBounds(270, 11, 300, 300);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(93, 82, 99, 20);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(93, 113, 99, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(label_1.getFont().deriveFont(11f));
		label_1.setBorder((Border) new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Result", TitledBorder.CENTER,
						TitledBorder.TOP, null, Color.BLACK));
		label_1.setBounds(71, 147, 145, 34);
		contentPane.add(label_1);
		
		JCheckBox checkBox = new JCheckBox("chronic kidney");
		checkBox.setBounds(72, 215, 97, 23);
		contentPane.add(checkBox);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(label_2.getFont().deriveFont(11f));
		label_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Suggestion", TitledBorder.LEFT,
						TitledBorder.TOP, null, Color.BLACK));
		label_2.setAlignmentX(0.5f);
		label_2.setBounds(54, 192, 185, 158);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("Reset");
		button_1.setBounds(374, 327, 89, 23);
		contentPane.add(button_1);
		
		JLabel label_3 = new JLabel("User :");
		label_3.setBounds(37, 26, 46, 14);
		contentPane.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(92, 23, 100, 20);
		contentPane.add(comboBox);
	}
	
		public void fillcombo() {
		
		try{
			String url = "jdbc:mysql://localhost/java_mini_project";
			String user = "root";
			String password = "";
			Connection connect = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.jdbc.Driver");
			connect =  (Connection) DriverManager.getConnection(url, user, password);
			stmt = (Statement) connect.createStatement();
			String sql = "SELECT * FROM user ";
			ResultSet rec = stmt.executeQuery(sql);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(92, 23, 100, 20);
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

