package Chapter064study;

public class StudyCalculatorExample {

	public static void main(String[] args) {

		StudyCalculator myCal = new StudyCalculator();
		myCal.systemOn();

		int result1 = myCal.add(50, 12);
		System.out.println("result1 :" + result1);

		byte x = 66;
		byte y = 12;

		double result2 = myCal.divide(x, y);
		System.out.println("result2 :" + result2);
		
		myCal.systemOff();

	}

}
