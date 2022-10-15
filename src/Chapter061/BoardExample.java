package Chapter061;

public class BoardExample {
public static void main(String[] args) {
	
	Board board1 = new Board("제목","내용");
	System.out.println(board1.title + board1.content);
	
	
	Board board2 = new Board("제목","내용", "홍길동ㅇ");
	System.out.println(board2.title+ board2.content +board2.writer);
	
	Board board3 = new Board("제목","내용", "홍길동", "2022-10-11");
	System.out.println(board3.title+ board3.content +board3.writer + board3.date);
	
	Board board4 = new Board("제목","내용", "홍길동ㅇ","2022-06-20", 0);
	System.out.println(board4.title+ board4.content +board4.writer + board4.date + board4.hitcount);
}
	
	
}
