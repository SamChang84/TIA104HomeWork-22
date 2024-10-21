package hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
	
	Random rd = new	Random();    		    //建立random物件
	int randomInt = rd.nextInt(10); 		//設定隨機整數範圍0-9
	Scanner sc = new Scanner(System.in);   //建立scanner物件
	System.out.print("開始猜數字吧!"); 			//提示開始輸入
	int guess;				//把用戶輸入的放到guess中
	do {
        System.out.print("請輸入你的猜測: "); //提示用戶輸入猜測
        guess = sc.nextInt();				//存放猜測
        
        if (guess != randomInt) {			
            System.out.println("猜錯囉");
        }
    } while (guess != randomInt); // 當猜測錯誤時重複循環

    System.out.println("答對了！答案就是 " + guess);
    
    // 關閉 Scanner
    sc.close();
}
}
