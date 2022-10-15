package Chapter064study;

public class Calculator100Example {
	public static void main(String[] args) {
		Calculator100 myCal = new Calculator100();

		// 정사각형의 넓이
		double result1 = myCal.areaRectangle(10);

		// 직사각형의 넓이
		double result2 = myCal.areaRectangle(15, 20);

		// 결과 출력
		System.out.println("정사각혀의 널이 =" + result1);
		System.out.println("직사각형의 넓이 =" + result2);

	}
}
