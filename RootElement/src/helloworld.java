package hello;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.xml.stream.Location;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Component;

public class helloworld {

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
					helloworld window = new helloworld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public helloworld() {
		initialize();
	}

	public String turnResult() {
		String stringUser = String.valueOf(addUser.getText());
		String stringBP = String.valueOf(addBP.getText());
		int intFBS = Integer.valueOf(addFBS.getText());
		BP bp = BPFactory.getBP(stringBP,intFBS);
		bp.selectBP();
		String reSultTest = bp.selectBP();
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
		lblResult.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Result", TitledBorder.CENTER,
				TitledBorder.TOP, null, Color.BLACK));
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
		
		
		final JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String stringUser = String.valueOf(addUser.getText());
				String stringBP = String.valueOf(addBP.getText());
				int intFBS = Integer.valueOf(addFBS.getText());

				BP bp = BPFactory.getBP(stringBP, intFBS);
				bp.selectBP();
				String hh = bp.selectBP();
				lblResult.setText(String.valueOf(bp.selectBP()));

				Disease ds = DiseaseFactory.getDisease(hh);
				ds.selectDisease();
				lblSuggestion.setText(String.valueOf(ds.selectDisease()));

				JPanel color2 = StatusFactory.getStatus(bp.selectBP());
				color2.setSize(200,200);
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
				helloworld addin = new helloworld();

			}
		});

		btnReset.setBounds(343, 319, 89, 23);
		frame.getContentPane().add(btnReset);

		frame.setVisible(true);

	}
}
