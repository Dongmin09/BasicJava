package chapter10.연습문제;

import java.util.Scanner;

public class ExerciseJavaApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("어떤 수를 나누시겠습니까? >>");
				String data1 = scanner.nextLine();
				System.out.println("어떤수로 나누시겠습니가? >>");
				String data2 = scanner.nextLine();

				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);

				int result = value1 / value2;

				System.out.printf("%d / %d = %d\n", value1, value2, result);

				break;

			}

			catch (NumberFormatException e) {

				System.out.println("잘못된 입력입니다. 다시 입력하세요");

			}

			catch (ArithmeticException a) {

				System.out.println("0으로 나눌수 없습니다. 다시입력해주세요");

			}

		}

	}
}
