package 챕터1;

public class star01 {

	public static void main(String[] args) {

		/*
		*
		**
		***
		****
		*****
		******
		*******
		********
		*********
		**********
		
		*/
		int i = 1;
		int j = 1;

		while (i <= 10) {
			// j<= 숫자 . 숫자만큼 별이 찍힘
			while (j <= i) {

				System.out.print("*");
				j = j + 1;
			}

			System.out.println("-"); // 다음줄로 이동
			j = 1; // 초기화
		    i = i+1;
		}
	}
}
