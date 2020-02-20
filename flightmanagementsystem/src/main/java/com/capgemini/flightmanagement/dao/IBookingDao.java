package com.capgemini.flightmanagement.dao;

import java.util.List;

import com.capgemini.exceptions.BookingException;
import com.capgemini.flightmanagement.beans.Booking;

public interface IBookingDao {

   List<Booking> bookingList=null;
   
   public Booking addBooking(Booking booking) throws BookingException;
   public Booking modifyBooking(Booking booking) throws BookingException;

}
