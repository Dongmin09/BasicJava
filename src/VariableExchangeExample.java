
public class VariableExchangeExample {
	public static void main(String[] args) {
		
	int a =10;
	int b = 7;
	
			
		System.out.println("a=" + a +"b="+b);
	
		
		// 
		int c;
		
		c= a;
		a=b;
		b=c;
		
		System.out.println("a="+a+"b="+b);
		
	}
}
