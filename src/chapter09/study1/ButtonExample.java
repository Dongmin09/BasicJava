package chapter09.study1;

public class ButtonExample {

	public static void main(String[] args) {

		Button btn = new Button();

		btn.setOnClickListener(new CallListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
