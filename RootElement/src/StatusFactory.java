import javax.swing.JPanel;

public class StatusFactory {

	
	public JPanel getStatus(String color) { 
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}else if(color.equalsIgnoreCase("WHITE")){
			return new White();
		}else if(color.equalsIgnoreCase("ORANGE")){
			return new Orange();
		}else if(color.equalsIgnoreCase("LIGHTGREEN")){
			return new Light_Green();
		}else if(color.equalsIgnoreCase("DARKGREEN")){
			return new Dark_Green();
		}else if(color.equalsIgnoreCase("BLACK")){
			return new Black();
		}
		return null;
	 } 

}