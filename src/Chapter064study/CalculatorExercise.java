package Chapter064study;

public class CalculatorExercise {

	int add(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {

		double sum = add(x, y);
		double result = sum / 2;
		return result;

	}

	void execute() {
		double result = avg(88, 25);
		System.out.println("실행결과 : " + result);

	}

	void println(String message) {

		System.out.println(message);
	}

}
