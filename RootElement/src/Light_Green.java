import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Light_Green extends JPanel implements Status {

	public void paintComponent(Graphics g) { 
		g.setColor(Color.decode("#7CFC00"));
		g.fillOval(0, 0, 200, 200);
	 } 

}