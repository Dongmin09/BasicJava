package chapter06.example.교수님풀이;

public class NewCar {

	private double speed;
	private String color;
	private static final double MAX_SPEED = 200 / 1.6;

	public NewCar() {

	}

	public NewCar(String color) {
		this.color = color;
	}

	// 메소드
	public double getSpeed() {
		return mileToMile(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	static double getMaxSpeed() {
		return mileToMile(MAX_SPEED);
	}

	public boolean speedUP(double speed) {

		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {

			return false;

		}

		this.speed += speed;
		return true;

	}

	private static double killoToMile(double distance) {
		return distance / 1.6;

	}

	private static double mileToMile(double distance) {
		return distance * 1.6;

	}

	public String toString() {
		return String.format("%d", speed);
	}

}
