package 나중에시험에나오는문제;

import java.util.Scanner;

public class 가위바위보시험에나옴 {
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
		System.out.println("가위바위보 게임");
		System.out.print("철수 :");
		String cheolsu = scanner.nextLine();
		System.out.print("영희 :");
		String yeonghui = scanner.nextLine();

		String win = "승리";
		String draw = "비김";

		if (cheolsu.equals("주먹") && yeonghui.equals("가위") || cheolsu.equals("가위") && yeonghui.equals("보")
				|| cheolsu.equals("보") && yeonghui.equals("주먹")) {

			System.out.print("철수" + win);

		}

		else if (yeonghui.equals("주먹") && cheolsu.equals("가위") || yeonghui.equals("가위") && cheolsu.equals("보")
				|| yeonghui.equals("보") && cheolsu.equals("주먹")) {

			System.out.print("영희" + win);
		}

		else {
			System.out.print(draw);
		}

	}
}
