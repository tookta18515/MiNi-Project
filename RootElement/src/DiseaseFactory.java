import javax.swing.JPanel;

public class DiseaseFactory extends AbstractFactory {

	public JPanel getDisease(String mode) { 
		if(mode == null){
			return null;
		}
		if(mode.equalsIgnoreCase("Blind")){
			return new Blind();
		}else if(mode.equalsIgnoreCase("ChronicKidneyDisease")){
			return new ChronicKidneyDisease();
		}else if(mode.equalsIgnoreCase("Ischemicheartdisease")){
			return new Ischemicheartdisease();
		}else if(mode.equalsIgnoreCase("Necrosis")){
			return new Necrosis();
		}else if(mode.equalsIgnoreCase("Paralysis")){
			return new Paralysis();
		}
		return null;
	 } 

}