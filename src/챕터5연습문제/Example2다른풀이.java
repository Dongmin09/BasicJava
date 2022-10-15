package 챕터5연습문제;

import java.util.Random;
import java.util.Scanner;

public class Example2다른풀이 {
	public static void main(String[] args) {

		
		int[] numbers = new int[45];
		
		// 45개의 주소가 0번으로 45개가 초기화 되어있음
		
		for(int i=0; i<numbers.length; i++) {
		
		numbers[i] = i+1;
		}

		
		Random random = new Random();
		for(int i=0; i<numbers.length; i++) {
			
			int ranNum = random.nextInt(45);
			
			
			
			
		// int x =	numbers[i];
		// int y =numbers[ranNum];
		
		
		// int temp 를 사용하여 옮기기
		
		
		int temp = numbers[i];
		numbers[i] = numbers[ranNum];
		numbers[ranNum] = temp;
		}
		
		for(int i=0; i<6; i++) {
			
			System.out.print(numbers[i] + "  ");
			
		}
		
	}
}
	



		
		
	



