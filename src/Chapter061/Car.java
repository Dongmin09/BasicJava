package Chapter061;

public class Car {

	// 필드
	String company = "현대 자동차";
	String model = "그랜져";
	String color = "검정";

	int maxSpeed = 350;
	int speed;

	// 생성자 1
	Car() {

	}

	/*
	 * this 생성문 Car(String model) {
	 * 
	 * this.model =model; // 생성자 2 }
	 * 
	 * 
	 * 
	 * Car(String model, String color){ this.model = model; //생성자 3 this.color =
	 * color;
	 * 
	 * }
	 * 
	 * 
	 * Car(String model, String color, int maxSpeed){
	 * 
	 * this.model = model; this.color = color; //생성자 4 this.maxSpeed = maxSpeed;
	 * 
	 * }
	 * 
	 * 
	 */

	/*Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	*/
	}


