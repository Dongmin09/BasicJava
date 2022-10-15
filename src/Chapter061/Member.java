package Chapter061;

public class Member {

	String name;
	String id;
	String password;
	int age;

	// Default Constructor(기본생성자)
	Member() {
	}

	// 매개 값(매개변수)이 있는 생성자
	
	// 필드의 name과 생성자 name는 구분이 필요하다
/*	Member(String name, int age) {
		// this : 메모리에 위치한 객체 자신을 가리킨다.

		this.name = name;
		this.age = age;
	
	}

	Member(String id, String password) {
		this.id = id;
		this.password = password;
		}	
	
	
	
	void run() {
		
		System.out.println(name);
	}
	
*/

	// 확인 문제 244p 2번
	Member(String name, String id){
		this.name = name;
		this.id = id;
		
	}
	
	
	
	
}


