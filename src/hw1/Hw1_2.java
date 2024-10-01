package hw1;

public class Hw1_2 {
	
	//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	
	public static void main(String[]args) {
		int egg = 200, x =12 ;
		System.out.println(egg / 12 );
		System.out.println(egg % x);
		System.out.println( egg + "顆蛋有" + (egg / 12) + "打" + (egg% x) +"顆");
	}
}
