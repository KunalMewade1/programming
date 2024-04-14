package programming.programming;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {
		
		GregorianCalendar date= new GregorianCalendar();
		int day=date.get(Calendar.DAY_OF_MONTH);
		int month=date.get(Calendar.MONTH);
		int year=date.get(Calendar.YEAR);
		
		int second=date.get(Calendar.SECOND);
		int minute=date.get(Calendar.MINUTE);
		int hour=date.get(Calendar.HOUR);
		
		System.out.println("Current date is"+day+"/"+(month+1)+"/"+year);
				
		System.out.println("Curent time is"+hour+":"+minute+":"+second);
	}

}
