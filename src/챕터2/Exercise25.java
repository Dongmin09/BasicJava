package 챕터2;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수 :"  );
		String a = scanner.nextLine();
		System.out.print("100원짜리 동전의 갯수 :"  );
		String b = scanner.nextLine();
		System.out.print("50원짜리 동전의 갯수 :" );
		String c = scanner.nextLine();
		System.out.print("10원짜리 동전의 갯수 :"  );
		String d = scanner.nextLine();
		
		
		int A = 500*(Integer.parseInt(a));
		int B = 100*(Integer.parseInt(b));
		int C = 50*(Integer.parseInt(c));
		int D = 10*(Integer.parseInt(d));
		int Sum = A+B+C+D;
		
	    System.out.println("저금통안의 동전의 총 액수:" + Sum);
		System.out.printf("저금통안의 동전의 총 액수: %d  ", Sum);
		
		
		
		
	System.out.println();
		
		
	}
}

/*                      Scanner scanner = new Scanner(System.in);
 *                      System.out.println("500원 짜리 동전의 개수 : ");
 *                      int coin500 = scanner.nextInt();
 *                      Scanner scanner = new Scanner(System.in);
 *                      System.out.println("100원 짜리 동전의 개수 : ");
 *                      int coin100 = scanner.nextInt();
 *                      Scanner scanner = new Scanner(System.in);                    
 *                      System.out.println("50원 짜리 동전의 개수 : ");
 *                      int coin50 = scanner.nextInt();
 *                      Scanner scanner = new Scanner(System.in);
 *                      System.out.println("10원 짜리 동전의 개수 : ");
 *                      int coin10 = scanner.nextInt();
 *                      
 *                      int totalCoin = 500*coin500 + 100*coin100 + 50*coin50 + 10*coin10;
 *                      System.out.println("동전의 총 금액 : " + totalCoin);
 *                      
 *                      scanner.close();
 * 
 * 
 * 
 */
