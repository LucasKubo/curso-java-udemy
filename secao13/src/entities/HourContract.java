package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(String date, Double valuePerHour, Integer hours) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.date = sdf.parse(date);
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double totalValue() {
		return this.valuePerHour*this.hours;
	}
}
