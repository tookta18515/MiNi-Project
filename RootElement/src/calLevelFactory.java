
public class calLevelFactory  {


	public static  calLevel getBP(String BP ,int FBS) { //เช็คว่าผู้ป่วยอยู่ในกลุ่มไหน (จะถูกใช้เสมอเมื่อมีการใส่ค่า BP และ FBS เข้ามา)
		
			String BP_1 = BP.substring(0, 3);
			String BP_2 = BP.substring(4);
	
			int BP_1_1 = Integer.parseInt(BP_1);
			int BP_2_2 = Integer.parseInt(BP_2);
			   
			if ((FBS < 100) && ((BP_1_1 < 120) && (BP_2_2 < 80))) {
				System.out.println("กลุ่มปกติ");
				return new normal(); //กลุ่มปกติ
			}else if (((FBS >= 100) && (FBS <= 125)) && ( ((BP_1_1 >= 120) && (BP_2_2 > 80))&& ((BP_1_1 < 139) && (BP_2_2 < 89)))){
				System.out.println("กลุ่มเสี่ยง");
				return new risk(); //กลุ่มเสี่ยง
			} else if (((FBS == 125) && ((BP_1_1 == 139) && (BP_2_2 == 89)))) {
				System.out.println("กลุ่มป่วย0");
				return new ill0(); //กลุ่มป่วย0
			} else if (((FBS >= 125) && (FBS <= 154)) && ( ((BP_1_1 >= 140) && (BP_2_2 >= 90))&& ((BP_1_1 < 160) && (BP_2_2 < 100)))){

				System.out.println("กลุ่มป่วย1");
				return new ill1(); //กลุ่มป่วย1
			} else if (((FBS > 125) && (FBS <= 182)) && ((BP_1_1 >= 160) && (BP_2_2 > 100))&& ((BP_1_1 < 179) && (BP_2_2 < 109))) {
				System.out.println("กลุ่มป่วย2");
				return new ill2(); //กลุ่มป่วย2
			}else if ((FBS >= 183)  && ((BP_1_1 >= 180) && (BP_2_2 >= 110))) {
				System.out.println("กลุ่มป่วย3");
				return new ill3(); //กลุ่มป่วย3
			}else
				System.out.println("กลุ่มป่วยขั้นรุนแรง");
				return new heavy();//กลุ่มป่วยขั้นรุนแรง
		
	 } 

}