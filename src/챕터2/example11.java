package 챕터2;

import java.util.Scanner;

public class example11 {
public static void main(String[] args) {
	// 한개씩 데이터를 받음. 불편하다 . System.in.read();
	// Scanner를 이용해서 데이터 입력 받기
	// 1번 문장 Scanner scanner = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	 
	//new Scan 까지 타이핑후 컨트롤 스페이스 -> import java.util.Scanner;
	// 커서를 S부분쯤에서 컨트롤 +1 엔터를 하면 1번문장 완성
	
	int value1 = scanner.nextInt();
	double value2 = scanner.nextDouble();
	String next = scanner.next();
	String nextLine = scanner.nextLine();
	// 문자의 경우 넥스트라인
	//scanner.next 에서 맞는 변수 누름 -> scanner.  r부분에서 컨트롤 1
	System.out.println(value1);
	System.out.println(value2);
	
	// next 를 입력하게 되면 결과값이 실시간으로 도출됨 console에
}
}
