

public class BPFactory extends AbstractFactory {//น้ำตาลในเลือด

	@Override
	FBS getFBS(Integer numFBS) {
		
	      
	      return null;
	   }
	@Override
	Disease getDisease() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	BP getBP(Integer numBP) {
		if(numBP == null){
	         return null;
	      }		
	      
	      if(numBP<=100){//ปกติ สีขาว
	         return new BP1();
	         
	      }else if((numBP>100)&&(numBP<125)){//เสี่ยง สีเขียวอ่อน
	         return new BP2();
	         
	      }else if((numBP>125)&&(numBP<=154)){//ป่วย สีเหลื่อง
		         return new BP3();
		         
		  }else if((numBP>=155)&&(numBP<=182)){//ป่วย สีส้ม
		         return new BP4();
		         
		  }else if(numBP>=183){//ป่วย สีส้ม
		         return new BP5();
		         
		  }
	      
	      
		return null;
	}

	@Override
	Status getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}