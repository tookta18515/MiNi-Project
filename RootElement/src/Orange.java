package hello;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Orange extends JPanel implements Status {

	public void paint(Graphics g) {
		 super.paint(g);
		g.setColor(Color.orange);
		g.fillOval(0,0, 200, 200);
	 } 

}