package com.capgemini.flightmanagement.beans;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Booking {

	private int bookingId;
	private User userId;
	private LocalDate bookingDate;
	private double ticketCost;
	private Flight flight;
	private int noOfPassengers;

	public Booking(int bookingId, User userId, LocalDate bookingDate, double ticketCost, Flight flight,
			int noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.ticketCost = ticketCost;
		this.flight = flight;
		this.noOfPassengers = noOfPassengers;
	}

	public Booking() {
		super();
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", ticketCost=" + ticketCost + ", flight=" + flight + ", noOfPassengers=" + noOfPassengers + "]";
	}

}
