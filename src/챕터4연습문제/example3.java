package 챕터4연습문제;

import java.util.Scanner;

public class example3 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자. 평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점
		 * 둘째자리까지만 출력) 평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상
		 * 70점 미만이면 D, 60점 미만이면 F로 계산한다.
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");

		System.out.print("프로그래밍의 기초 :");
		int A = scanner.nextInt();
		System.out.print("데이터베이스:");
		int B = scanner.nextInt();
		System.out.print("화면 구현:");
		int C = scanner.nextInt();
		System.out.print("애플리케이션 구현:");
		int D = scanner.nextInt();
		System.out.print("머신러닝:");
		int E = scanner.nextInt();

		int sum = A + B + C + D + E;
		double average = sum / 5;
		int credit = (int)average;

		System.out.println("총점 :" + sum);
		System.out.println("평균 : " + average);
		System.out.println();
		System.out.println("학점 :");

		if (90 <= credit) {
			System.out.print("A");
		} else if (80 <= credit && credit < 90) {
			System.out.print("B");
		} else if (70 <= credit && credit < 80) {
			System.out.print("C");
		} else if (60 <= credit && credit < 70) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}

	}
}


/*

변수는 소문자 클래스는 대문자.

*/