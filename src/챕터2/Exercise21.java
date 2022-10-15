package 챕터2;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는? (단위 : m) :");
		String width = scanner.nextLine();
		System.out.print("세로의 길이는? (단위 : m) :");
		String height = scanner.nextLine();
	    
		
		double area = Double.parseDouble(width);
		double perimeter = Double.parseDouble(height);
		
		
		
		System.out.println("직사각형의 넓이 :" + (float)(area*perimeter));
	    System.out.println("직사각형의 둘레 :" + (float)(area+perimeter));

		// 다른 방법으로는 변수하나를 정의해서 넓이와 둘레 값을 따로 정의해서 표현하는 방법도 있다.
	}		
}


/*            
                System.out.print("가로의 길이는? (단위 : m) :");
		          Double width = scanner.nextDouble();
		          System.out.print("세로의 길이는? (단위 : m) :");
		          Double height = scanner.nextDouble(); 
					
                처리
                  double area = width*height;
                  double perimeter = (width + height) *2;
                출력 
                 System.out.println("직사각형의 넓이 :" + area);
                 System.out.println("직사각형의 둘레 :" + perimeter);

*/

