package 여태배운종합적인것;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceExample {
	public static void main(String[] args) {
		List<Apple> list = Arrays.asList(
			new Apple(1, Color.RED),
			new Apple(2, Color.RED),
			new Apple(3, Color.GREEN),
			new Apple(4, Color.YELLOW),
			new Apple(5, Color.GREEN),
			new Apple(6, Color.GREEN),
			new Apple(7, Color.YELLOW),
			new Apple(8, Color.RED),
			new Apple(9, Color.RED),
			new Apple(10, Color.GREEN),
			new Apple(11, Color.RED)
		);
		
		List<Apple> redApples = FilterUtils.filter(list, new Predicate<Apple>() {
			
			@Override
			public boolean test(Apple apple) {
				
				
				return apple.getColor() == Color.RED;
			}
			
		
		});
	
		/// Method Reference
		
		redApples.forEach(System.out::println);
	}



}