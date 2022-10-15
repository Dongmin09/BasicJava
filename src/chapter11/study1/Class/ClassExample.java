package chapter11.study1.Class;

import java.lang.reflect.Field;



public class ClassExample {

	public static void main(String[] args) {
		
		Class class1 = Member.class;
		Class class2= Class.forName("chapter11.study1.Member");
		
		
		Member mumber = new Member("a001", "김은대", 100);
		Class class3 = member.getClass();
		
		Field[] fields = class3.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
			
			
			
		}
		
		
		
	}
	
	
}
