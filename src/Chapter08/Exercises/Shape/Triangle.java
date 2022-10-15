package Chapter08.Exercises.Shape;

public class Triangle extends Shape {

	private double side;

	public Triangle(double side) {

		this.side = side;
		name = "삼각형";

	}

	@Override
	public double area() {

		return (Math.sqrt(3) / 4) * side * side;

	}
	
	@Override
	public double perimeter() {
		return 3 * side;
	}

}
