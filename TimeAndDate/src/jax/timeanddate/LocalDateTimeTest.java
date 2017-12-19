package jax.timeanddate;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime time=LocalDateTime.now();
		System.out.print(time.getYear()+" 年 ");
		System.out.print(time.getMonthValue()+" 月 ");
		System.out.print(time.getDayOfMonth()+" 日 ");
		System.out.print(time.getHour()+" 时 ");
		System.out.print(time.getMinute()+" 分 ");
		System.out.println(time.getSecond()+" 秒 ");
		System.out.println(time.toString());
	}

}
