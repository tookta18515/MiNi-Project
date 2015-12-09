import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Dark_Green extends JPanel implements Status {

	public void paintComponent(Graphics g) { 
		g.setColor(Color.decode("#006400"));
		g.fillOval(0, 0, 200, 200);
	 } 

}