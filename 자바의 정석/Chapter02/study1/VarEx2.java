package Chapter02.study1;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		
		int x=10,  y=50;
		int temp = 0;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		temp =x;
		x=y ;  // y값을 x에 저장
		y=temp;  // x에거 값을 받아 저장되어 있는 temp 10을 y로 초기화
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	// 옮기기
	
	
	
	
}
