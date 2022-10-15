package 챕터5연습문제;

public class example1 {
	public static void main(String[] args) {

		int array[] = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		// 최댓값과 최솟값 구하기.

		// int max = Integer.MIN_VALUE; 최소값지정
		// int min = Integer.MAX_VALUE; 최대값 지정

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];

			}

		}
		
		for (int i=0; i< array.length; i++){
			if (min > array[i]) {
				
				min = array[i];
			}
			
		}
		
		
		
		

		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : "+ min);
	}
}

