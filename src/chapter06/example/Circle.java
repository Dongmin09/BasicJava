package chapter06.example;

public class Circle {

	// 필드
	private double radius;
	private double x;
	private double y;

	// 생성자

	Circle() {  // 생성자는 아무설정을 안하고 생성시 초기값 0으로 설정하여 초기화한다.
	}

	// 메소드
	public double getRadius() {
		return radius;
	}

	// 반지름이 0이상이면 입력받은 반지름 값을 출력하지만
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}

/*		else {
			
			return;  이부분은 생략할 수 있다.  그리고 생성자에서 저런 방식으로 생성을 해주면	
					보이지는 않지만 초기값이 0으로 설정되어있어서 0으로 출력된다.
			
		}
*/		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	double getArea() {

		return Math.PI * radius * radius;

	}

}