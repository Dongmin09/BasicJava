package chapter12;

public class GenericExample {

	public static void main(String[] args) {
		
		/*
		 * Generic(제네릭, 지네릭)
		 * JDK 1.5부터 도입
		 * 표현 방법 : <> 도입
		 * Object 를 사용
		 * 
		 * 
		 * 
		 */
		
		
		
	/*	IntValue value = new IntValue(10);
		System.out.println(value.getValue());
		StringValue value2 = new StringValue("10");
		System.out.println(value2.getStringValue());
	*/	
		
		
		
		/// 오브젝트 를 활용하여 타입이 불안전한데 이 불안전을 안전하게 사용하기위해 제네릭을 사용
		//Value value3 = new Value(10);
		//System.out.println(value3.getValue());
		
		//Value value4 = new Value("100");
		//System.out.println(value4.getValue());
		
		
		 //Value value3 = new Value("a");
		 //int value4 = (int) value
		
		
				 
		Box<Integer> box = new Box<Integer>(100);
		//box.setValue(100);
		int integer = box.getValue();
		 
		System.out.println(integer);		 
				 
				 
		
		
		
		
		
	}
	
	
}
