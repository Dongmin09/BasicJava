package Chapter02.study1;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("두자리 정수 입력");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 문자열 숫자로 변환

		System.out.println("입력내용" + input);
		System.out.printf("num=%d%n", num);
		
		scanner.close();
	}

}
