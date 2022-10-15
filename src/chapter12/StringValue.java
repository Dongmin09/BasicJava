package chapter12;

public class StringValue {

	private String StringValue;

	public String getStringValue() {
		return StringValue;
	}

	public void setStringValue(String stringValue) {
		StringValue = stringValue;
	}

	public StringValue(String stringValue) {
		super();
		StringValue = stringValue;
	}

	@Override
	public String toString() {
		return "StringValue [StringValue=" + StringValue + "]";
	}
	
	
	
	
}
