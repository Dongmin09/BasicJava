
package chapter10.연습문제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("어떤 수를 나누시겠습니까? >>");
				// 'a b'가 입력되엇을때
				// next() : 공백 또는 엔터 - a 
				// nextLine() : 엔터만 - a b
				String data1 = scanner.nextLine();
				System.out.println("어떤수로 나누시겠습니가? >>");
				String data2 = scanner.nextLine();
			
				int result1 = Integer.parseInt(scanner.nextLine(data1));
				int result2 = Integer.parseInt(scanner.nextLine(data1));
				
				int result = result1 / result2;

				System.out.printf("%d / %d = %d\n", data1, data2, result);

				break;

			}

			catch (InputMismatchException e) {

				System.out.println("잘못된 입력입니다. 다시 입력하세요");

			}

			catch (ArithmeticException a) {

				System.out.println("0으로 나눌수 없습니다. 다시입력해주세요");

			}

		}

	}
}
