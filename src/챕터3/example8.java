package 챕터3;

public class example8 {
	public static void main(String[] args) {

//사다리꼴의 넓이를 구하는 코드 정확한 소수자릿수가 나오도록 코드작성
		// ((밑변 + 아랫변)*높이) / 2
		int lengthTop = 5;
		int lengthBottom = 10;
		int heigth = 7;
		// double area = (lengthTop + lengthBottom) * heigth / 2.0;
		double area = (double)((lengthTop+lengthBottom)*heigth/2); 

		// 더하기 빼기 곱하기는 소수점이 나올수 없기 때문에 나누기에서 소수점을 사용함.
		System.out.println(area);

	}
}
