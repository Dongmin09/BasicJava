package chapter07.exercise;

public class Student extends Human {

	// 필드
	private String major;

	// 메소드

	Student(String name, int age, String major) {
		
		
		super(name, age);
		this.major=major;
		
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	public String toString() {
		
		return (super.toString() + ", 전공" + major);
		
	}
	
	

}
