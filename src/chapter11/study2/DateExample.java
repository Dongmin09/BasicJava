package chapter11.study2;



import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
 public static void main(String[] args) {
	
	 //Date date = new Date();
	 // 2022-07-05
	 
	 
	 
	 //SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 e요일 hh시 mm분 ss초");
	 //System.out.println(format.format(date));
	 
	 //Calendar 형식
	 
	 Calendar calendar = Calendar.getInstance(); //싱글톤 형식
	 int year = calendar.get(Calendar.YEAR);	 
	 int month = calendar.get(Calendar.MONTH) ; 
	 int dayOfMonth = calendar.get(Calendar.DATE);
	 System.out.println(year + "년 " + month+ "월 " + dayOfMonth + "일");
	 
	 
	 }
	 
	 
	 // LocalDateTime 으로 변경
	 LocalDateTime.now().format(DateTimeFormatter.ofPattern(""))
	 
}
