package exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate date = LocalDate.parse("23/08/2020", formatter); // LocalDate = 2010-02-23
		DayOfWeek dow = date.getDayOfWeek();  // Extracts a `DayOfWeek` enum object.
		String output = dow.getDisplayName(TextStyle.SHORT, Locale.US); // String = Tue
		System.out.println(dow);
	}
	

}
