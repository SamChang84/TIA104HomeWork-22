package hw3;

import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		  System.out.print("請輸入第一個邊長: ");
//	      int side1 = sc.nextInt();
//	      System.out.print("請輸入第二個邊長: ");
//	      int side2 = sc.nextInt();
//	      System.out.print("請輸入第三個邊長: ");
//	      int side3 = sc.nextInt();
//	  if(side1>=1 && side2>=1 && side3>=1 && side1+side2>side3 && side1+side3>side2 && side2+side3>side1) {
//		  	if( side1 == side2 && side2 == side3 ){
//		      System.out.println("正三角形");
//			}else if(side1 == side2 || side2 == side3||side1 == side3) {
//				System.out.println("等腰三角形");
//			}else {
//				System.out.println("其他三角形");
//			}	  
//	  }else {
//		  System.out.println("不是三角形");
//	  }   	
		Scanner sc = new Scanner(System.in);

        // 获取有效的第一条边长
        int side1 = getPositiveSide(sc, "請輸入第一個邊長: ");
        // 获取有效的第二条边长
        int side2 = getPositiveSide(sc, "請輸入第二個邊長: ");
        // 获取有效的第三条边长
        int side3 = getPositiveSide(sc, "請輸入第三個邊長: ");

        // 判断是否构成三角形
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // 判断三角形类型
            if (side1 == side2 && side2 == side3) {
                System.out.println("正三角形");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
        // 关闭 Scanner
        sc.close();
	}
	
	 private static int getPositiveSide(Scanner sc, String prompt) {
	        int side;
	        do {
	            System.out.print(prompt);
	            side = sc.nextInt();  // 获取用户输入的整数
	            if (side <= 0) {
	                System.out.println("邊長必須是正數，請重新輸入。");
	            }
	        } while (side <= 0);  // 如果用户输入的数小于等于0，继续提示输入
	        return side;
	    }
}
	

