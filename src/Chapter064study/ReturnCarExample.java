package Chapter064study;

public class ReturnCarExample {
	public static void main(String[] args) {

		ReturnCar myGas = new ReturnCar();

		myGas.setGas(10);  //ReturnCar의 setGas() 메소드 호출

		boolean gasState = myGas.isLeftGas(); // ReturnCar의 isLeftGas() 메소드호출
		if (gasState) {

			System.out.println("출발합니다.");
			myGas.run(); // ReturnCar의 run() 메소드 호출

		}

		if (myGas.isLeftGas()) { //ReturnCar의 isLeftGas() 메소드호출

			System.out.println("gas를 주입할 필요가 없습니다.");
		}

		else {

			System.out.println("gas를 주입해 주세요");
		}

	}
}
