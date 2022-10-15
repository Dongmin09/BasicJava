package Chapter061study;

public class CarSample {

	// 필드

	String company = "기아자동차";
	String model;
	String color;
	int maxSpeed;

	/// 생성자

	CarSample() {
		// 1. 생성자
	}

	CarSample(String model) {
		this(model, "은색", 250);   // 마지막 코드 호출
	}

	CarSample(String model, String color) {
		this(model, color, 250);  // 마지막 코드 호출

	}

	CarSample(String model, String color, int maxSpeed) {  // 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
