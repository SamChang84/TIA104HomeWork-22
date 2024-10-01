package hw1;

public class Hw1_4 {
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	
	//將常數定義在方法外
	public static final double PI = 3.1415;
	
	public static void main(String[]args) {
		double radius = 5.0;
		double area = radius*radius*PI;
		double circumference = radius*2*PI;
		
		System.out.println("若半徑為"+radius+"則圓面積為"+area+"圓周長為"+circumference);
    
		
	}
}
