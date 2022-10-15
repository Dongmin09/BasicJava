package chapter06.study06_5;

public class CalculatorStaticTest {

	public static void main(String[] args) {

		double result = 10 * 10 * CalculatorStatic.pi;
		int result1 = CalculatorStatic.plus(5, 10);
		int result2 = CalculatorStatic.multiplication(5, 4);

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}

}
