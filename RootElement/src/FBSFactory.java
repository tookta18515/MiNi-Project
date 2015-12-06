

public class FBSFactory extends AbstractFactory {

	@Override
	FBS getFBS(Integer numFBS) {
		if(numFBS == null){
	         return null;
	      }		
	      
	      if(numFBS<=100){//ปกติ สีขาว
	         return new FBS1();
	         
	      }else if((numFBS>100)&&(numFBS<125)){//เสี่ยง สีเขียวอ่อน
	         return new FBS2();
	         
	      }else if((numFBS>125)&&(numFBS<=154)){//ป่วย สีเหลื่อง
		         return new FBS3();
		         
		  }else if((numFBS>=155)&&(numFBS<=182)){//ป่วย สีส้ม
		         return new FBS4();
		         
		  }else if(numFBS>=183){//ป่วย สีส้ม
		         return new FBS5();
		         
		  }
		return null;
	}

	@Override
	Disease getDisease() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	BP getBP(Integer numBP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Status getStatus() {
		// TODO Auto-generated method stub
		return null;
	}



}