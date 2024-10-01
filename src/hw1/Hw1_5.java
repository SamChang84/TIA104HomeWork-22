package hw1;

public class Hw1_5 {
	public static void main(String[]args) {
		
		//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		double deposit = 1500000; 		//初始存款
		int years = 10; 		  		//存放年分	
		double interestRate = 0.02;	    //每年利率	
		
//		複利公式:
		
		for(int i = 1; i <= years; i++ ){
			 double interest = deposit * interestRate;
			 deposit += interest;
		}	
			
		System.out.println("本金加利息為"+deposit);
	}
}




