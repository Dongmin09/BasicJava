package Chapter08.Exercises.Shape;


public abstract class Shape implements Comparable<Shape> {

	String name;

	public abstract double area();

	public abstract double perimeter();

	public int compareTo(Shape o) {

		if (area() > o.area()) {

			return 1;
		}

		else if (area() < o.area()) {

			return -1;

		}

		else {

			return 0;
		}

	}

	@Override
	public String toString() {

		return String.format("도형의 종류 : %s , 둘레 : %.2fcm  ,  넓이 : %.2f㎠" , name, perimeter() ,area());

	}

}
