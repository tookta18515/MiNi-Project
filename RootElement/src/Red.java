import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Red extends JPanel implements Status {

	public void paintComponent(Graphics g) { 
		g.setColor(Color.red);
		g.fillOval(50, 50, 300, 300);
	 } 

}