package Chapter08.Exercises.Shape;

public class Rectangle extends Shape{

	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		name = "사각형";
	}

	// 메소드
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}
	
	
	
}
