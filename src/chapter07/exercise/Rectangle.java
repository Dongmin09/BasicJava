package chapter07.exercise;

public class Rectangle extends Shape {

	private double width;
	private double height;

	Rectangle() {

	}

	public Rectangle(double width, double height) {
		
		this.height = height;
		this.width = width;

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {

		return width * height;

	}

	public double perimeter() {

		return 2 * (width + height);

	}

	@Override
	public String toString() {

		return String.format("도형의종류 : 사각형, 둘레 : %.1fcm, 널이 : %,1f㎠", perimeter(), area());
		// Math.sqrt
	}

}
