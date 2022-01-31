package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = new Date();
		Date d2 = sdf1.parse("07/04/2021");
		Date d3 = new Date (0L);
		
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		System.out.println("d3: " + d3);
		System.out.println("------------------------");
		System.out.println("d1: " + sdf2.format(d1));
		System.out.println("d2: " + sdf2.format(d2));
		System.out.println("d3: " + sdf2.format(d3));
		System.out.println("------------------------");
		System.out.println("d1: " + sdf3.format(d1));
		System.out.println("d2: " + sdf3.format(d2));
		System.out.println("d3: " + sdf3.format(d3));
	}

}
