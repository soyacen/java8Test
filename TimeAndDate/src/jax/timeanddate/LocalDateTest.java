package jax.timeanddate;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.print(date.getYear()+" 年 ");
		System.out.print(date.getMonthValue()+" 月 ");
		System.out.println(date.getDayOfMonth()+" 日 ");
		System.out.println(date.toString());
	}

}
