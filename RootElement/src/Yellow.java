import java.awt.Color;
import java.awt.Graphics;

public class Yellow implements Status {

	public void paintComponent(Graphics g) { 
		g.setColor(Color.yellow);
		g.fillOval(50, 50, 300, 300);
	 }  

}