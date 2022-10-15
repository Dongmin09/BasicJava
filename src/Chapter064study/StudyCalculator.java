package Chapter064study;

public class StudyCalculator {
	
	// 메소드

	void systemOn() {

		System.out.println("전원을 킨다");

	}

	int add(int x, int y) {
		int result = x + y;
		return result;

	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;

		return result;

	}

	void systemOff() {

		System.out.println("전원을 끈다");
	}
	

}
