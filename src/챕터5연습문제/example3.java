package 챕터5연습문제;

import java.util.Random;
import java.util.Scanner;

public class example3 {
	public static void main(String[] args) {

		/*
		 * 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		String str[] = { "가위", "주먹", "보" };

		System.out.println("가위바위보 게임");
		System.out.print("사람 :");
		String people = scanner.nextLine();
		System.out.print("로봇 :");

		Random random = new Random();
		int num = random.nextInt(3) + 0;
		String win = "승리";
		String draw = "비김";

		System.out.println(str[num]);

		if (people.equals("주먹") && str[num].equals("가위") || people.equals("가위") && str[num].equals("보")
				|| people.equals("보") && str[num].equals("주먹")) {

			System.out.print("사람" + win);

		}

		else if (str[num].equals("주먹") && people.equals("가위") || str[num].equals("가위") && people.equals("보")
				|| str[num].equals("보") && people.equals("주먹")) {

			System.out.println("로봇" + win);
		}

		else {
			System.out.println(draw);
		}

	}

}