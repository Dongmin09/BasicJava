package Chapter066.package1;   // 패키지가 동일

public class B {
 public B() {
	 
	 
	 A a = new A();
	 a.field1 =1;
	 a.field2 =1;
	 a.field3 =1;  // pravate 필드 접근 불가 (컴파일에러)
	 
	 
	 a.method1();
	 a.method2();
	 a.method3(); // private 메소드 접근 불가 (컴파일에러)
 }
}
