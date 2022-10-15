package chapter07.exercise;

public class Triangle extends Shape {

	private double side;

	public Triangle() {

	}

	public Triangle(double side) {
		this.side = side;

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double area() {

		return side * side * (Math.sqrt(3) / 4); // Math.sqrt 는 루트를 뜻함

	}

	public double perimeter() {

		return side * 3;
	}

	@Override
	public String toString() {

		return String.format("도형의종류 : 삼각형, 둘레 : %.1fcm, 널이 : %,1f㎠", perimeter(), area());

	}

}
