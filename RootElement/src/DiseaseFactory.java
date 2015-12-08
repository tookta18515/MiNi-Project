package hello;
import javax.swing.JPanel;

public class DiseaseFactory {

	public static Disease getDisease(String mode) { 
		
		if(mode.equalsIgnoreCase("IncurrentDisease")){
			return new Incurrent_Disease();
		}else{
			return new Non_Incurrent_Disease();
		}
		
	 } 
	

}