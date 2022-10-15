package 챕터2;

import java.util.Scanner;

public class Exercise24 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		   // 원기둥의 부피
		
		
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위 : cm) : ");
		String a = scanner.nextLine();
		System.out.print("원기둥 높이를 입력하시오. (단위 : cm) : ");
		String b = scanner.nextLine();
		
		double c = Float.parseFloat(a);
		double d = Float.parseFloat(b);
		
		
		double Area = c*c*Math.PI; // 원기둥 밑변의 넓이
		double High = d;           // 원기둥의 높이
		double Bulk = Area*d;    
		
		
		System.out.println("원기둥 밑변의 넓이"+ Area + "cm²이고 "+ "원기둥의 부피는" + Bulk + "㎤이다.");
		System.out.printf(" 원기둥 밑변의 넓이 %f는 ", Area);
		System.out.print("cm²");
		System.out.printf(",이고 \"원기둥의 부피는\" %f" , Bulk); 
		System.out.print("㎤이다."); 
				
		
		// 원기둥의 부피 :반지름의 제곱 * 높이 * 3.14
		//  밑변의 넓이 : 반지름*반지름*3.14
		//  원주율 :  Math.PI
				
	}

}
/*						Scanner scanner = new Scanner(System.in);
                       System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위 : cm) : ");
                       double radius = scanner.nextDouble();
                       System.out.print("원기둥 높이를 입력하시오. (단위 : cm) : ");
                       double height = scanner.nextDouble();
                     
                       double area = Math.PI * radius * radius;
                       double volme = area * height;
                       
                       System.out.println(" 원기둥 밑변의 넓이 : " +area+ "%fcm², "부피 : " + volme + "%f㎤이다.  ");
                       System.out.printf("원기둥 밑변의 넓이 : %f㎠, 부피 : %f㎤이다. " , area , volme);
                      scanner.close();
                      
                        ㄹ 한자 = 단위 표시 기호
  	
 * 
 * 
 * 
 */
 