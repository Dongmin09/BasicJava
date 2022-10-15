package chapter10.study2;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		//1. try catch
		
		try {
			Class.forName("Java.lang.String2");
		} catch (ClassNotFoundException e) {

			System.err.println("클래스가 존재하지 않습니다.");
		}
		 run();

	}		
	



	static void run() throws ClassNotFoundException{
		// 2. throws execption
	Class.forName("Java.lang.String2");
	
	
	}
}
