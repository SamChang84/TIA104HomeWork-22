package hw3;

import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("請輸入第一個邊長: ");
	      int side1 = sc.nextInt();
	      System.out.print("請輸入第二個邊長: ");
	      int side2 = sc.nextInt();
	      System.out.print("請輸入第三個邊長: ");
	      int side3 = sc.nextInt();
	  if(side1>=1 && side2>=1 && side3>=1 && side1+side2>side3 && side1+side3>side2 && side2+side3>side1) {
		  	if( side1 == side2 && side2 == side3 ){
		      System.out.println("正三角形");
			}else if(side1 == side2 || side2 == side3||side1 == side3) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("其他三角形");
			}	  
	  }else {
		  System.out.println("不是三角形");
	  }   	
 }
}
	

