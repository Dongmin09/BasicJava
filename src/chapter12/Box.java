package chapter12;

public class Box<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @param value
	 */
	public Box(T value) {
		this.value = value;
	}
	
	
	
	
	
	
	
}