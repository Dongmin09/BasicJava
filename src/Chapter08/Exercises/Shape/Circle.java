package Chapter08.Exercises.Shape;

public class Circle extends Shape{

	private double radius;


	public Circle(double radius) {

		this.radius = radius;
		name = "원";
	}

	public double area() {

		return radius * radius * Math.PI;

	}

	public double perimeter() {
		
		return 2 * radius * Math.PI;
		

	}
	

}
	

