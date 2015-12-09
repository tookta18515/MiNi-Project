import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Blind extends JPanel implements Disease {

	public void pain(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
	     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	     RenderingHints.VALUE_ANTIALIAS_ON);
	     Font font = new Font("Serif", Font.PLAIN, 96);
	     g2.setFont(font);
	     g2.drawString("Blind", 40, 120);
		 g2.setColor(Color.black);
		
		
	 }

	@Override
	public String selectDisease() {
		// TODO Auto-generated method stub
		return null;
	} 

}