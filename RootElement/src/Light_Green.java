package hello;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Light_Green extends JPanel implements Status {

	public void paint(Graphics g) { 
		 super.paint(g);
		g.setColor(Color.decode("#7CFC00"));
		g.fillOval(0,0, 200, 200);
	 } 

}