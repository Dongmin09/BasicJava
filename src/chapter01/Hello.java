package chapter01;

public class Hello {
	// 컨트롤 + 스페이스 m =>
	public static void main(String[] args) {

		int dan = 2;
		int num = 1;

		while (dan <= 9) {

			System.out.println(dan + "단");

			while (num <= 9) {

				System.out.println(dan + "x" + num + "= " + (dan * num));

			}

			// 2*9= 18 9를 1로 초기화

			num = 1;
			// 단을 1증가
			dan = dan + 1;

		}

		// dan => 10

	}
}