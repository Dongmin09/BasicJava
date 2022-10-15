package 챕터3;

import java.util.Scanner;

public class example9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번 째 수 :");
		Double Num1 = scanner.nextDouble();
		System.out.print("두번 째 수 :");
		Double Num2 = scanner.nextDouble();

		double sum = Num1 / Num2;

		if (Num2 == 0.0) {

			System.out.println("결과 : 무한대");
		}

		else {
			System.out.println("결과 : " + sum);

		}
	}
}

/*
 * 
 * 
 * }
 */