package hw2;

public class Hw2_5 {
//	阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//	4 14 24 34 40~49
	public static void main(String[] args) {
		int sum = 0;							//計算有幾個可選
		for (int i = 1 ;i <= 49 ;i++ ) {		
			if((i%10) != 4 && (i/10) != 4) {	//印出除以10餘數不為4，且除以10商不為4的數	
			System.out.println(i);
			sum = sum +1;
			}
		}
		System.out.println("總共有"+sum+"個");
		
	}
}
