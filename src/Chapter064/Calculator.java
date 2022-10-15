package Chapter064;

public class Calculator {

	
	// 메소드
	
	void powerOn() {
		
		
		System.out.println("전원을 켭니다.");
		
		
	}
	
	
	int plus(int x, int y) {
		
		int result = x + y;
		return result;
		// return x+ y;
	}
	
	double divide(int x, int y) {
		
		double result = (double)x / (double) y;
		return result;
		
		// retrun (double) x / y;  
		
		
		
	}
	
	void powerOff() {
		
		System.out.println("전원을 끕니다.");
	}
	
	
	
}
