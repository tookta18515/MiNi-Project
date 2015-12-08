package hello;
public class BPFactory  {


	public static  BP getBP(String BP ,int FBS) {
		
			String BP_1 = BP.substring(0, 3);
			String BP_2 = BP.substring(4);
	
			int BP_1_1 = Integer.parseInt(BP_1);
			int BP_2_2 = Integer.parseInt(BP_2);
			   
			if ((FBS < 100) && ((BP_1_1 < 120) && (BP_2_2 < 80))) {
				return new BP1(); //ปกติ
			}else if (((FBS >= 100) && (FBS <= 125)) && ( ((BP_1_1 >= 120) && (BP_2_2 > 80))&& ((BP_1_1 < 139) && (BP_2_2 < 89)))){
				return new BP2(); //เสี่ยง
			}else if (((FBS == 125) && ((BP_1_1 == 139) && (BP_2_2 == 89)))) {
				return new BP3(); //ป่วย0
			}else if (((FBS >= 125) && (FBS <= 154)) && ( ((BP_1_1 >= 140) && (BP_2_2 > 90))&& ((BP_1_1 < 139) && (BP_2_2 < 99)))){
				return new BP4(); //ป่วย1
			}else if (((FBS <= 154) || (FBS <= 182)) && ((BP_1_1 >= 160) && (BP_2_2 > 100))|| ((BP_1_1 < 179) && (BP_2_2 < 109))) {
				return new BP5(); //ป่วย2
			}else if ((FBS >= 183)  && ((BP_1_1 >= 180) && (BP_2_2 >= 110))) {
				return new BP6(); //ป่วย3
			}else
				return new BP7();
		
	 } 

}