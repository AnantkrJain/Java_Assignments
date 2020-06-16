package DateTime;

import java.util.Calendar;

public class DateAndTime {
	public static void main(String[] args) {
		
		int day, month, year;
		int second, minute, hour;
		
		Calendar date = Calendar.getInstance();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		
		System.out.println("Date is "+ day + "/" + month + "/" + year);
		System.out.println("Time is "+ hour + ":" + minute + ":" + second);
	}
}
