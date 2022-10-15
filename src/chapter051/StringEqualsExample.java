package chapter051;

public class StringEqualsExample {
	public static void main(String[] args) {
			// jdk 1.5 부터 String Pool(문자열 관리 공간)
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} 
			else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
				}

		if (strVar1.equals(strVar2)) {

			System.out.println("strVar1과 strVar2는 문자열이 같음");

		}

		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		// 각 각 다른 공간에 생성 됫기 때문이고 위의 경우는 String 를 효율적으로 관리하기 위해 String Pool이 생겨서 같게나옴
		// String을 쓸때는 꼭 equals 를 사용하여 문자열을 비교.
		// 현업에서는 쓰이지 않음; 단, 암호화 내용을 작업할 때는 사용함.

		if (strVar3 == strVar4) {

			System.out.println("strVar3과 strVar4는 참조가 같음");
		} 
			else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
				}

		if (strVar3.equals(strVar4)) {

			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}
}
