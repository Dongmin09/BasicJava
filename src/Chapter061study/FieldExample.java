package Chapter061study;

public class FieldExample {
	public static void main(String[] args) {

		// 객체 생성
		Field student1 = new Field();

		// 필드 값 읽기

		System.out.println("이름은 :" + student1.name);
		System.out.println("고등학교 :" + student1.school);
		System.out.println("키 :" + student1.high);
		System.out.println("번호 :" + student1.number);
		System.out.println("성적 :" + student1.study);

		// 필드 값 변경

		student1.study = "중";
		System.out.println("수정된 성적 :" + student1.study);

	}

}
