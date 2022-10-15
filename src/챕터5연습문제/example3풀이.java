package 챕터5연습문제;

import java.util.Random;
import java.util.Scanner;

public class example3풀이 {
	public static void main(String[] args) {

		/*
		 * 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		String [] computerArr = { "가위", "주먹", "보" };

		System.out.println("가위바위보 게임");
		System.out.print("플레이어 :");
		
		/// 이 부분을 바꾸는 것.
		String people = scanner.nextLine();
		System.out.print("컴퓨터 :");
		///	
		Random random = new Random();
		
		String computer = computerArr[random.nextInt(3)];
		
		// int num = random.nextInt(3) + 0;
		
		
		String result = "";
		String draw = "비김";
		System.out.println(computer);
		// System.out.println(str[num]);

		if (people.equals("주먹") && computer.equals("가위") || people.equals("가위") && computer.equals("보")
				|| people.equals("보") && computer.equals("주먹")) {

			result = "플레이어 승리";

		}

		else if (computer.equals("주먹") && people.equals("가위") || computer.equals("가위") && people.equals("보")
				|| computer.equals("보") && people.equals("주먹")) {

			result = "컴퓨터 승리";
		}

		else {
			System.out.println(draw);
		}

	}

}