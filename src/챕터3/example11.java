package 챕터3;

import java.util.Scanner;

public class example11 {
public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("아이디");
	    String name = scanner.nextLine();
	    
	    System.out.print("패스워드:");
	    String strPassword = scanner.nextLine();
	    int passward = Integer.parseInt(strPassword);
	    
	    if (name.equals("java")) 
	    {
	    	
	    
	    if (passward==12345) {
	    	System.out.println("로그인 성공");
	    }
	    
	    else {
	    	System.out.println("로그인 실패 : 패스워드가 틀림");
	    }
	    }
	    else {
	    	System.out.println("로그인 실패: 아이디 존재하지 않음");
	    }
	    

}
}

/// 물어볼것
/*
 * String str1 = "hello";
String str2 = str1;
String str3 = new String("hello");

---

System.out.print(str1==str2); //true
System.out.print(str2==str3); //false
System.out.print(str1.equals(str2)); //true
System.out.print(str2.equals(str3)); //true


equals() 함수와 ==연산자는 양변의 내용을 비교해서 true 또는 false 값을 반환하는 역활을 수행한다.

​
차이점


 equals() 함수는 두개의 주소에 직접 접근하여 두 값을 비교하고 ==연산자는 두개의 변수가 있는 주소를 비교한다.



*/

