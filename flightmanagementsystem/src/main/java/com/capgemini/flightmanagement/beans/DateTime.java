package com.capgemini.flightmanagement.beans;

public class DateTime {

	private String date;
	private String hour;

	public DateTime(String date, String hour) {
		super();
		this.date = date;
		this.hour = hour;
	}

	public DateTime() {
		super();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "DateTime [date=" + date + ", hour=" + hour + "]";
	}

}
