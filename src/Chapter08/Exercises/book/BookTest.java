package Chapter08.Exercises.book;

public class BookTest {
public static void main(String[] args) {
	
	System.out.println("<소장 도서 목록>");
	Book[] books = new Book[6];
	books[0] = new Novel("칼의 노래", "김훈");
	books[1] = new Novel("칼의 노래", "김훈");
	books[2] = new Poet("칼의 노래", "김훈");
	books[3] = new Poet("칼의 노래", "김훈");
	books[4] = new ScienceFiction("칼의 노래", "김훈");
	books[5] = new ScienceFiction("칼의 노래", "김훈");
	
	for ( Book b : books) {
		
		
		System.out.println(b);
		
	}
	
	System.out.println("1번 책과 2번 책은 같은 책인가요?"  + books[0].equals(books[1]) );
	
	
}
}
