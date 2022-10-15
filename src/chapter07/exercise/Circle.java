package chapter07.exercise;

public class Circle extends Shape {

	private double radius;

	private Circle() {

	}

	public Circle(double radius) {

		this.radius = radius;
	}

	public double area() {

		return radius * radius * Math.PI;

	}

	public double perimeter() {
		
		return 2 * radius * Math.PI;
		

	}
	
	@Override
	public String toString() {

		return String.format("도형의종류 : 원, 둘레 : %.1fcm, 널이 : %,1f㎠", perimeter(), area());

	}

}
