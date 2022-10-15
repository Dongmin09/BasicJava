package Chapter064;

public class ReturnCarExample {
	public static void main(String[] args) {

		ReturnCar myCar = new ReturnCar();

		myCar.setGas(5); // RetrunCar의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas(); // RetrunCar의 isLeftGas() 메소드 호출
		if (gasState) {

			System.out.println("출발합니다");
			myCar.run(); // RetrunCar의 run() 메소드 호출
		}

		if (myCar.isLeftGas()) { // RetrunCar의 isLeftGas() 메소드 호출

			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {

			System.out.println("gas를 주입하세요");
		}

	}
}
