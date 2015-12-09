
import javax.swing.JPanel;

public class StatusFactory {

	
	
	public static JPanel getStatus(String color) { 
		
		if(color.equalsIgnoreCase("Normal")){
			return new White();
		}else if(color.equalsIgnoreCase("Risk")){
			return new Light_Green();
		}else if(color.equalsIgnoreCase("Ill0")){
			return new Dark_Green();
		}else if(color.equalsIgnoreCase("Ill1")){
			return new Yellow();
		}else if(color.equalsIgnoreCase("Ill2")){
			return new Orange();
		}else if(color.equalsIgnoreCase("Ill3")){
			return new Red();
		}else if(color.equalsIgnoreCase("IncurrentDisease")){
			return new Black();
		}else
		
		return null;
	 } 
	
	}

