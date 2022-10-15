package 챕터3.연습문제;

import java.util.Scanner;

public class example3 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("윤년인지를 확인할 연도를 입력하세요 :");
	int a = scanner.nextInt();
	

	
    String year = (a%4==0 && a%100!=0 || a%400==0   ?  "윤년입니다." : "윤년이 아닙니다");
    
    // (a%4==0 && a%100 != 0 : "윤년입니다."  ? a%400==0 ? "윤년입니다" : "윤년이 아닙니다");
    
    System.out.println(a+year);
   
    
    
}
}
