import java.awt.Graphics;

import javax.swing.JPanel;

public class ChronicKidneyDisease extends JPanel implements Disease {

	public void pain(Graphics g) {
		g.drawString("ChronicKidneyDisease", 50, 50);
		
	 }

	@Override
	public String selectDisease() {
		// TODO Auto-generated method stub
		return null;
	} 

}