
import javax.swing.JPanel;

public class DiseaseFactory {

	public static Disease getDisease(String mode) { 
		
		if(mode.equalsIgnoreCase("IncurrentDisease")){
			return new Complication();
		}else{
			return new NoComplication();
		}
		
	 } 
	

}