package 여태배운종합적인것;



import java.util.ArrayList;
import java.util.List;

public class FilterUtils<T> {
	
	//Generic Method
	public static<T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> redApples = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t)) {
				redApples.add(t);
			}
		}
		return list;
	}
}