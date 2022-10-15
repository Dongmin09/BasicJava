package Chapter064확인문제;

import java.util.Arrays;

public class PrinterExample {
	public static void main(String[] args) {

		
		
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

		// static 이 붙은 필드나 메소드는 바로 직접 사용한다.
		// printer.println('a');
		
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		// new 를 통해서 static 이 붙은 메소드를 호출 할 수 도 있다.
		MyPrinter myPrinter = new MyPrinter();
		myPrinter.println('b');
	}

}
