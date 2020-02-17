package com.capg;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class CalExpByDate {

	static LocalDate jdate = LocalDate.of(2020, 01, 13);

	public static int getExpByDays(LocalDate tdate) {

		long x = ChronoUnit.DAYS.between(jdate, tdate);

		return (int) x;

	}
	public static int getExpByMonths(LocalDate tdate) {

		long x = ChronoUnit.MONTHS.between(jdate, tdate);

		return (int) x;

	}
	public static int getExpByYears(LocalDate tdate) {

		long x = ChronoUnit.YEARS.between(jdate, tdate);

		return (int) x;

	}
	/*public static long getExpByMinutes(LocalDate tdate) {

		long x = ChronoUnit.MINUTES.between(jdate, tdate);

		return  x;

	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate tdate = LocalDate.now();
		
		System.out.println(getExpByDays(tdate)+" D");
		System.out.println(getExpByMonths(tdate)+" M");
		System.out.println(getExpByYears(tdate)+" Y");
		//System.out.println(getExpByMinutes(tdate)+" Mins");
	}

}
