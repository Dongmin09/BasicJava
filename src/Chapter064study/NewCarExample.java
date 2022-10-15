package Chapter064study;

public class NewCarExample {
	public static void main(String[] args) {

		NewCar myCar = new NewCar();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");

	}
}
