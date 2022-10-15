package 챕터4연습문제;

import java.util.Scanner;

public class example4 {
	public static void main(String[] args) {

		/*
		 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자. 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다. 문자열을 읽기
		 * 위해서는 Scanner 클래스의 next() 메소드를 이용하면 된다. 또 자바에서 문자열 비교는 주의를 기울여야 한다. String 타입
		 * 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수 :");
		String A = scanner.nextLine();
		System.out.print("영희 :");
		String B = scanner.nextLine();

		String win = "승리";
		String drow = "비김";

		if (A.equals("주먹")) {
			if (B.equals("가위")) {

				System.out.print("결과는 :");
				System.out.println("철수" + win);

			}
		}

		if (A.equals("가위")) {
			if (B.equals("보")) {

				System.out.print("결과는 :");
				System.out.println("철수" + win);
			}
		}

		if (A.equals("보")) {
			if (B.equals("주먹")) {

				System.out.print("결과는 :");
				System.out.println("철수" + win);
			}

		}

		if (B.equals("주먹")) {
			if (A.equals("가위")) {

				System.out.print("결과는 :");
				System.out.println("영희" + win);

			}
		}

		if (B.equals("가위")) {
			if (A.equals("보")) {

				System.out.print("결과는 :");
				System.out.println("영희" + win);
			}
		}

		if (B.equals("보")) {
			if (A.equals("주먹")) {

				System.out.print("결과는 :");
				System.out.println("영희" + win);
			}

			else {
				System.out.println("결과는 : 비김");
			}

		}

	}

}


/*
 * 시험에 나옴.
 *if (A.equals(B)){
 *	System.out.println("결과는 : 비김");
 * }
 *
 * else if(A.equals("가위")&&B.equals("바위")||(A.equals("바위")&&B.equals("가위")||(A.equals("보")&&B.equals("바위"){
 * 		System.out.println("철수 승리");
 * }
 * 
 * else {
 * 	System.out.println("영희 승리");
 * 
 * }
 * 
*/