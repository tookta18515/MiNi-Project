import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Addinfo {

	private String resultTest;
	private String resultResat;
	private JFrame frame;
	private JTextField addBP;
	private JTextField addFBS;
	private JTextField ds;
	private JPanel color2;
	private JTextField addUser;
	private JPanel panelStatus;
	protected Object location;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Addinfo window = new Addinfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public Addinfo() {
		initialize();
	}

	public String turnResult() {
		String stringUser = String.valueOf(addUser.getText());
		String stringBP = String.valueOf(addBP.getText());
		int intFBS = Integer.valueOf(addFBS.getText());
		calLevel allnum = calLevelFactory.getBP(stringBP, intFBS);
		allnum.selectBP();
		String reSultTest = allnum.selectBP();
		return resultTest;
	}

	private void initialize() {

		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 400);
		Container c = frame.getContentPane();
		c.setLayout(null);

		JLabel lblBp = new JLabel("BP :");
		lblBp.setBounds(23, 49, 46, 14);
		frame.getContentPane().add(lblBp);

		JLabel lblFbs = new JLabel("FBS :");
		lblFbs.setBounds(23, 74, 46, 14);
		frame.getContentPane().add(lblFbs);

		JLabel lblUser = new JLabel("User :");
		lblUser.setBounds(23, 21, 46, 14);
		frame.getContentPane().add(lblUser);

		addUser = new JTextField();
		addUser.setBounds(62, 18, 99, 20);
		frame.getContentPane().add(addUser);
		addUser.setColumns(10);

		addBP = new JTextField();
		addBP.setBounds(62, 46, 99, 20);
		frame.getContentPane().add(addBP);
		addBP.setColumns(10);

		addFBS = new JTextField();
		addFBS.setBounds(62, 71, 99, 20);
		frame.getContentPane().add(addFBS);
		addFBS.setColumns(10);

		final JLabel lblResult = new JLabel("");
		lblResult.setFont(lblResult.getFont().deriveFont(11f));
		lblResult.setBorder((Border) new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Result",
				TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		lblResult.setBounds(40, 139, 145, 34);
		frame.getContentPane().add(lblResult);

		final JLabel lblSuggestion = new JLabel("");
		lblSuggestion.setFont(lblSuggestion.getFont().deriveFont(11f));
		lblSuggestion.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblSuggestion.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Suggestion", TitledBorder.LEFT,
				TitledBorder.TOP, null, Color.BLACK));
		lblSuggestion.setBounds(23, 184, 185, 158);
		frame.getContentPane().add(lblSuggestion);

		JLabel lblStatus = new JLabel("");
		lblStatus.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Status", TitledBorder.LEFT,
				TitledBorder.TOP, null, Color.BLACK));
		lblStatus.setBounds(235, 10, 300, 300);
		frame.getContentPane().add(lblStatus);

		JCheckBox chckbxChronic = new JCheckBox("chronic kidney");
		chckbxChronic.setBounds(40, 204, 97, 23);
		frame.getContentPane().add(chckbxChronic);

		JCheckBox chckbxIs = new JCheckBox("ischemic heart");
		chckbxIs.setBounds(40, 230, 97, 23);
		frame.getContentPane().add(chckbxIs);

		JCheckBox chckbxNe = new JCheckBox("necrosis");
		chckbxNe.setBounds(40, 256, 97, 23);
		frame.getContentPane().add(chckbxNe);

		JCheckBox chckbxPra = new JCheckBox("paralysis");
		chckbxPra.setBounds(40, 282, 97, 23);
		frame.getContentPane().add(chckbxPra);

		JCheckBox chckbxBli = new JCheckBox("blind");
		chckbxBli.setBounds(40, 308, 97, 23);
		frame.getContentPane().add(chckbxBli);

		final JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			private int chro;
			private int Is;
			private int Ne;
			private int Pra;
			private int Bli;

			public void actionPerformed(ActionEvent arg0) {

				String stringUser = String.valueOf(addUser.getText());
				String stringBP = String.valueOf(addBP.getText());
				int intFBS = Integer.valueOf(addFBS.getText());

				// check Chronic
				if (chckbxChronic.isSelected()) {
					chro = 1;
				} else {
					chro = 0;
				}

				// check Ischemic
				if (chckbxIs.isSelected()) {
					Is = 1;
				} else {
					Is = 0;
				}

				// check Necrosis
				if (chckbxNe.isSelected()) {
					Ne = 1;
				} else {
					Ne = 0;
				}

				// check Paralysis
				if (chckbxPra.isSelected()) {
					Pra = 1;
				} else {
					Pra = 0;
				}

				// check Blind
				if (chckbxBli.isSelected()) {
					Bli = 1;
				} else {
					Bli = 0;
				}

				Connection connect = null;
				Statement stmt = null;

				try {

					Class.forName("com.mysql.jdbc.Driver");

					connect = DriverManager
							.getConnection("" + "jdbc:mysql://localhost/java_mini_project" + "?user=root&password=");

					stmt = connect.createStatement();

					// SQL Insert
					String sql = "INSERT INTO user " + "(name,bp,fbs,chro,isc,nec,par,bli) " + "VALUES ('"
							+ addUser.getText() + "', '" + addBP.getText() + "','" + addFBS.getText() + "','" + chro
							+ "','" + Is + "','" + Ne + "','" + Pra + "' ,'" + Bli + "')";

					stmt.execute(sql);
					System.out.println(sql);

					/*
					 * // Reset Text Fields textName.setText("");
					 * textBP.setText(""); textFBS.setText("");
					 * 
					 * chckbxChronic.setText(""); chckbxIs.setText("");
					 * chckbxNe.setText(""); chckbxPra.setText("");
					 * chckbxBli.setText("");
					 */

					JOptionPane.showMessageDialog(null, "Record Inserted Successfully");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				}

				try {
					if (stmt != null) {
						stmt.close();
						connect.close();
					}
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					System.out.println(e2.getMessage());
					e2.printStackTrace();
				}
				calLevel bp = calLevelFactory.getBP(stringBP, intFBS);
				bp.selectBP();
				String hh = bp.selectBP();
				lblResult.setText(String.valueOf(bp.selectBP()));

				

				JPanel color2 = StatusFactory.getStatus(bp.selectBP());
				color2.setSize(200, 200);
				frame.getContentPane().add(color2);
				color2.setLocation(285, 55);
			}
		});
		btnSubmit.setBounds(62, 105, 99, 23);
		frame.getContentPane().add(btnSubmit);

		final JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				frame.setVisible(false);
				Addinfo addin = new Addinfo();

			}
		});

		btnReset.setBounds(343, 319, 89, 23);
		frame.getContentPane().add(btnReset);

		frame.setVisible(true);

	}
}
