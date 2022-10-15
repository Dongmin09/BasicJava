package 챕터2;

import java.util.Scanner;

public class Exercise22 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//  시간 구하기
		// 시간 = 거리 / 속도
		// 거리 : double distance = 40e12;
		// 속도 : 300,000km
		
		
		
		double a = 40e12; // 거리
		double b = 300000; // 속도
		double c = a/b / 60 / 60 / 24 / 365; //시간
       		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은" + c + "광년이다.");
		
		
	}
	
}


/*
            풀이
            
              double distance = 40e12;
              double speed = 300000;
              double result = distance / speed / 60 / 60 / 24 / 365 ;   
               300초 -> 5분
               1년의 단위 : 60*60*24*365 
               
              System.out.println(result);
              
                     
*/