package Chapter064study;

public class ReturnCar {

	// 필드
	int gas;
	// 생성자

	// 메소드
	void setGas(int gas) {

		this.gas = gas; // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값 변경

	}

	boolean isLeftGas() { // isLeftGas 리턴값이 boolean 인 메소드
							// gas 필드값이 0 = false, 0 != true 를 리턴
		if (gas == 0) {

			System.out.println("gas가 없습니다.");
			return false; // false 리턴

		}

		System.out.println("gas가 있습니다.");
		return true; // true 리턴

	}

	void run() { // run : 리턴값이 없는 메소드 gas 필드값이 0일경우
		while (true) { // return 으로 메소드 강제 종료
			if (gas > 0) {

				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			}

			else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 리턴값이 없으므로 메소드 종료
			}

		}
	}

}
