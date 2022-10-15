package Chapter064;

public class CarKeyExample {

	public static void main(String[] args) {

		CarKey myCar = new CarKey();

		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도:" + speed + "km/h");

	}

}
