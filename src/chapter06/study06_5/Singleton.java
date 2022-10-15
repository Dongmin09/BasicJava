package chapter06.study06_5;

public class Singleton {

// 정적 필드 선언	
	private static Singleton singleton = new Singleton();

// 생성자
	private Singleton() {
	}

// 정적 메소드
	static Singleton getInstance() {

		return singleton;
	}

}
