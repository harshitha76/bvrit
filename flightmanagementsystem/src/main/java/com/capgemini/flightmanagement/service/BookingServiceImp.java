package com.capgemini.flightmanagement.service;

import java.util.Random;

import com.capgemini.exceptions.BookingException;
import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.dao.BookingDaoImp;
import com.capgemini.flightmanagement.dao.IBookingDao;

public class BookingServiceImp implements IBookingService {

	private IBookingDao bookingdao;

	public BookingServiceImp()
	{
		bookingdao=new BookingDaoImp();
	}

	@Override
	public Booking addBooking(Booking booking) throws BookingException {
		
		boolean flag=false;
		String num=String.valueOf(booking.getNoOfPassengers());
		flag=num.matches("[1-6]");
		if(flag==false)
		{
			throw new BookingException("passengers should not be of zero and null");
		}
		Random random=new Random();
		int id=random.nextInt(8999)+1000;
		booking.setBookingId(id);
		return bookingdao.addBooking(booking);
		
	}

	@Override
public Booking modifyBooking(Booking booking) throws BookingException{
		
		
		boolean flag=false;
		String num=String.valueOf(booking.getNoOfPassengers());
		flag=num.matches("[1-6]");
		if(flag==false)
		{
			throw new BookingException("Number of passengers should be not be zero and not more than 6");
		}
		
		return bookingdao.modifyBooking(booking);
	}
}
