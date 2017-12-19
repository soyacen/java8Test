package jax.timeanddate;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeTest {
	public static void main(String[] args) {
		ZonedDateTime time=ZonedDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(time.format(df));
	}
}
