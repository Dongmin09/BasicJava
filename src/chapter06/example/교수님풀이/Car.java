package chapter06.example.교수님풀이;

public class Car {

	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car() {

	}

	public Car(String color) {
		this.color = color;
	}

	// 메소드
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return MAX_SPEED;
	}

	public boolean speedUP(double speed) {

		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {

			return false;

		}

		this.speed += speed;
		return true;

	}

	public String toString() {
		return String.format("%d", speed);
	}

}
