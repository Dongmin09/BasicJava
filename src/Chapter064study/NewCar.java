package Chapter064study;

public class NewCar {

	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {

		System.out.println();
	}

	void run() {

		for (int i = 20; i <= 100; i += 10) {

			speed = i;
			System.out.println("달립니다 시속" + speed + "km/h");

		}

	}

}
