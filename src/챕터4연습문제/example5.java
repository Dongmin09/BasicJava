package 챕터4연습문제;

import java.util.Random;
import java.util.Scanner;

public class example5 {
	public static void main(String[] args) {

		/*
		 * 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자. 사용자가 추측한 수를 입력하면, 컴퓨터가 생성한
		 * 수보다 큰지 작은지를 알려준다. 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다. 1부터 100까지의 랜덤 숫자는 new
		 * Random().nextInt(100) + 1로 구할 수 있다.
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100) + 1;
		
		
		boolean run = true;
		int sum=0;
		
		
		System.out.println("1부터 100 사이의 정수 중 하나를 선택하시오");
		while (run) {
			
			int A = scanner.nextInt();
			sum++;
			
	
				if (num > A ){
					System.out.print("정답은 더 큰 수 입니다.");
					
				
				}

				else if (num < A) {
					System.out.print("정답은 더 작은 수 입니다.");
					
					

				}

				else if(A==num) {
					System.out.println("정답입니다");
					scanner.close();
					run = false;
					
				}
				
			
		
			}
		
			
			System.out.println(sum + "만에 맞췃다.");
			System.out.println("게임을 종료합니다.");

		}
	}

