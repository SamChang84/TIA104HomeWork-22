package hw2;

public class Hw2_3 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int product = 1;			//積的初始值
		int i = 1;					//迴圈初始值
		while(i <= 10) {			//設條件為10
			product = product * i;  //每個數相乘
			i++;					//每圈+1	
		}
		System.out.println(product);
	}
}
