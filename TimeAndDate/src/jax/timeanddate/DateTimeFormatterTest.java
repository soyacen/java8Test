package jax.timeanddate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
	public static void main(String[] args) {
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime time=LocalDateTime.parse("2016-05-25 15:53:55",df);
		System.out.print(time.getYear()+" 年 ");
		System.out.print(time.getMonthValue()+" 月 ");
		System.out.print(time.getDayOfMonth()+" 日 ");
		System.out.print(time.getHour()+" 时 ");
		System.out.print(time.getMinute()+" 分 ");
		System.out.println(time.getSecond()+" 秒 ");
		System.out.println(time.toString());
	}
}
