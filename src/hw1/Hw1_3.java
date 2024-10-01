package hw1;

public class Hw1_3 {

	public static void main(String[]args) {
		
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSecs = 256559;
		
		int secsInOneMin = 60;
		int secsInOneHour = secsInOneMin*60;
		int secsInOneDay = secsInOneHour * 24;
		//
		System.out.println( totalSecs + "秒有" + (totalSecs / secsInOneDay) + "天" 
		+(totalSecs % secsInOneDay / secsInOneHour) +"小時"
		+(totalSecs % secsInOneHour / secsInOneMin)+"分"
		+(totalSecs % secsInOneMin)+"秒");
	}
	
}