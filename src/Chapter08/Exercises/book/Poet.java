package Chapter08.Exercises.book;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return lateDays * 200;
	}

}