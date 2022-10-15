package 챕터5연습문제;

import java.util.Random;
import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {

		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오. (로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를
		 * 출력한다.)
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		int lottoNum[] = new int[6];
		Random random = new Random();
		int num = 0;

		System.out.print("로또 번호는 :  ");

		while (num < 6) {

			lottoNum[num] = random.nextInt(45) + 1;
			for (int i = 0; i < num; i++) {
				if (lottoNum[i] == lottoNum[num]) {

					num--;

				}

			}

			num++;

		}

		for (int i = 0; i < lottoNum.length; i++) {

			System.out.print(lottoNum[i] + " ");
		}

	}
}

//  잘모름



