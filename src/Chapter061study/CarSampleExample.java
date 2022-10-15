package Chapter061study;

public class CarSampleExample {
	public static void main(String[] args) {

		CarSample car1 = new CarSample(); // 1번생성자 선택
		System.out.println(car1.company);
		System.out.println();

		CarSample car2 = new CarSample("자가용"); // 2번생성자 선택
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();

		CarSample car3 = new CarSample("자가용", "파랑"); // 3번생성자 선택
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();

		CarSample car4 = new CarSample("자가용", "파랑", 500); //4번 생성자선택
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);

	}
}
