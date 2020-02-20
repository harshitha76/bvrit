package com.capgemini.flightmanagement.service;


import com.capgemini.exceptions.BookingException;
import com.capgemini.flightmanagement.beans.Booking;

public interface IBookingService {

	public Booking addBooking(Booking booking) throws BookingException;
	public Booking modifyBooking(Booking booking)throws BookingException;
	
	
}
