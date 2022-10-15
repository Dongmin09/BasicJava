package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// ArrayList<String> list1 = new ArrayList<>(); // 초급자
 		
		List<String> list = new ArrayList<>();  // 중급자
		
		
		//3. 
		List<String> list4 = Arrays.asList("java", "jdbc", "Servlet/jsp");
		
		list.add("Java");
		list.add("JDBC");
		
		for(String string : list) {
			
			System.out.println(string);
		}
		
		
		
		
		list.add("Servlet/JSP");
		
		
		
		list.add(2, "Database");
		list.add("myBatis");
		
		
		for(int i =0; i < list.size(); i++) {
			
			System.out.println(i + ":" + list.get(i));
		}
		
		System.out.println();
		
		// get	
		String skill = list.get(0);
		System.out.println(skill);
		
		
		//remove
		list.remove(0);
		
		for(int i =0; i < list.size(); i++) {
			
			System.out.println(i + ":" + list.get(i));
		}
		
		System.out.println();

		list.remove("myBatis");
		
	for(int i =0; i < list.size(); i++) {
			
			System.out.println(i + ":" + list.get(i));
		}
		
		System.out.println();
		
		list.clear();
		System.out.println(list.size());
		
		
		
	}
	
}
