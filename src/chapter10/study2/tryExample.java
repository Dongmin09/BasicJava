package chapter10.study2;

import java.util.Scanner;

public class tryExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {

				System.out.print(" 첫번째 숫자를 입력하시오>");
				String data1 = scanner.nextLine();
				System.out.print(" 두번째 숫자를 입력하시오>");
				String data2 = scanner.nextLine();

				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				int result = value1 + value2;

				System.out.printf("%d + %d = %d\n", value1, value2, result);
				break;
			} catch (NumberFormatException e) {

				System.out.println("숫자를 입력하세요");
			}

		}
		scanner.close();
	}
}
