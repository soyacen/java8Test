package jax.timeanddate;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.print(time.getHour()+" 时 ");
		System.out.print(time.getMinute()+" 分 ");
		System.out.println(time.getSecond()+" 秒 ");
		System.out.println(time.toString());
	}

}
