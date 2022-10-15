package 챕터1;

public class loop01 {
	public static void main(String[] args) {

		int[] jumsu = { 85, 90, 70, 75, 100, 95, 95, 80, 75, 85 };

		// jumsu 의 평균을 구해보자 while
		// 평균 : 전체의 합 / 개수
		// jumsu[0] : 85 / jumsu[1] : 90 ...

		int i = 0;
		int sum = 0; // 누적변수

		while (i < jumsu.length) { // i는 : 0~9까지 반복

			sum = sum + jumsu[i];
			i++; // 0~9까지 반복 i는 결국 10

		}

		System.out.println((double) sum / jumsu.length);

	}
}
