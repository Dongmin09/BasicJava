package chapter11.study1.확인문제.student;

import java.util.Objects;

public class Student {

	private String studentNum;

	
	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	
	public String getStudentNum() {

		return studentNum;
	}

	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}

}
