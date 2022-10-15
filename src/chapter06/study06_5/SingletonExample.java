package chapter06.study06_5;

public class SingletonExample {
public static void main(String[] args) {
	/*
	Single ton obj1 = new Singleton();
	Single ton obj2 = new Singleton();  싱클톤 규칙에 따라 오류 발생함
	*/
	
	Singleton obj1 = Singleton.getInstance();
	Singleton obj2 = Singleton.getInstance();
	
	if(obj1 == obj2) {
		
		System.out.println("같은 Singleton 객체이다");
		
	}
	
	else { 
		System.out.println("다른 Singleton 객체이다.");
	}
	
	
}

}
