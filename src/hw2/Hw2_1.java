package hw2;

public class Hw2_1 {
	
	public static void main(String[] args) {
		
//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;    //儲存總和
		
		for(int i = 1 ; i <=1000 ; i++) {   //從1開始，跑到100，每次+1
			if (i % 2 == 0) {				//看除2餘數是否為0
				sum = sum + i;				//把每次的i疊加到sum中
			}	
		}
	System.out.println(sum);	
	}
}