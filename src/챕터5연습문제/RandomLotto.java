package 챕터5연습문제;

import java.util.Random;

public class RandomLotto {
public static void main(String[] args) {
	
	int[] lotto = new int[7]; // 로또번호 7개
	int cnt = 0; // 숫자 생성
	Random rm = new Random();

	System.out.print("로또번호 생성 : ");

	// 로또 랜덤 추첨
	while (cnt < 7) {
		lotto[cnt] = rm.nextInt(45) + 1; // 로또번호는 45번까지 있음. 0이 안나오게하려면 + 1 넣어줘야함
		for (int i = 0; i < cnt; i++) {
			if (lotto[i] == lotto[cnt]) { // 중복된 숫자가 있으면
				cnt--; // 중복된 숫자 제거
				continue; // while문의 처음으로 돌아가 증감식을 수행함
			}
		}
		cnt++; // 계속 추첨
	}

	// 출력문
	for (int i = 0; i < lotto.length; i++) {
		System.out.print(lotto[i] + " ");
	}
}

	
}

