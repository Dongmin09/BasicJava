package chapter053;

import java.util.Calendar;

public class EnumWeekExample1 {
public static void main(String[] args) {
	
	Week today = null;
	
	Calendar cal = Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK);
	
	
	switch(week) {
	
	case 1 :
		today = cal.SUNDAY; break;
		
	case 2 :
		today = cal.MONDAY; break;	
		
	case 3 :
		today = cal.TUESDAY; break;	
		
	case 4 :
		today = cal.WEDNESDAY; break;	
		
	case 5 :
		today = cal.THURSDAY; break;	
	
	case 6 :
		today = cal.FRIDAY; break;
	
	case 7 :
		today = cal.SATURDAY; break;
		
		
	}
	
	
	
}
}
