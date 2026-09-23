package com.demo.blocks.interfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoTime {
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate tmr=date.plusDays(1);
		System.out.println(tmr);
		
		LocalDate nweek=date.plusWeeks(1);
		System.out.println(nweek);
		
		System.out.println("current year::"+date.getYear());
		System.out.println("current month::"+date.getMonth());
		System.out.println("current day::"+date.getDayOfMonth());
		
		LocalTime lt= LocalTime.now();
		System.out.println("Local time is-->"+lt);
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println("ZonedTime::"+zdt);
		
		System.out.println(ZonedDateTime.now(ZoneId.of("London/uk")));
	
		
		
	}

}
