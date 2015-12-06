

public abstract class AbstractFactory extends DiseaseFactory {

	
	abstract FBS getFBS(Integer numFBS);
	abstract Disease getDisease() ;
	abstract BP getBP(Integer numBP) ;
	abstract Status getStatus() ;
}