package mini;

public abstract class AbstractFactory {
		abstract Status getStatus(String status );
		abstract FBS getFBS(String FBS );
		abstract Disease getDisease(String Disease );
		abstract BP get(String BP );
}
