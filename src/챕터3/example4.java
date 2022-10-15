package 챕터3;

public class example4 {
	public static void main(String[] args) {
		
		int pencils = 522;
		int students =30;
		
		// 학생 1명이 가지는 연필의 개수
		
		int pencilsPerStudent = (pencils/students);
		// 위 정답
		System.out.println(pencilsPerStudent);
		// 나누기 함수 : /
		
		
		//  남은 연필의 개수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		// 나머지 구하는 함수 %
	}

}
