import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Yellow extends JPanel implements Status {

	public void paintComponent(Graphics g) { 
		g.setColor(Color.yellow);
		g.fillOval(0, 0, 200,200);
		
	 }  

}