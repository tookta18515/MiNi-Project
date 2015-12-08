package hello;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo { 
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(600, 600);
		Container c = frame.getContentPane();
		c.setLayout(null); 
		
/*		AbstractFactory StatusFactory = FactoryResult.getFactory("STATUS");
		JPanel color1 = StatusFactory.getStatus("ill4");
		color1.setSize(500,500);
		frame.add(color1);*/
		
		JPanel color2 = StatusFactory.getStatus("WHITE");
		color2.setSize(500,500);
		frame.add(color2);
		
/*		JPanel color3 = StatusFactory.getStatus("ORANGE");
		color3.setSize(500,500);
		frame.add(color3);
		
		JPanel color4 = StatusFactory.getStatus("LIGHTGREEN");
		color4.setSize(500,500);
		frame.add(color4);
		
		JPanel color5 = StatusFactory.getStatus("DARKGREEN");
		color5.setSize(500,500);
		frame.add(color5);
		
		JPanel color6 = StatusFactory.getStatus("BLACK");
		color6.setSize(500,500);
		frame.add(color6);
		
		JPanel color7 = StatusFactory.getStatus("YELLOW");
		color7.setSize(500,500);
		frame.add(color7);*/
		
		
		
		
		frame.setVisible(true);
	}

}