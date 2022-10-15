package chapter06.example;

public class Time {

	// 필드
	private int hour; // 0~23의 값
	private int minute; // 0~59의 값
	private int second; // 0~59의 값

	// 생성자
	public Time() { // 초기값 생성자
	}

	public Time(int hour, int minute, int second) {

		// 인자로 전달된 값으로 해당하는 필드를 초기화, 유효 범위를 벗어나는 값 해당필드 0 초기화
		if (hour > 0 && hour < 24) {

			this.hour = hour;
		}

		if (minute > 0 && minute < 60) {

			this.minute = minute;
		}

		if (second > 0 && second < 60) {

			this.second = second;

		}

	}

	public String toString() {
		// public 에 타입이 들어가면 항상 return을 써야함. void는 안써도됨.)
		// 아래는 toString 코드 프린트ln 없이 사용가능. 
		return String.format("%02d:%02d:%02d", hour, minute, second);

	}

	// 메소드

}
