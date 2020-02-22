package com.capgemini.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.dao.BookingDaoImp;

class BookingTest {
	BookingDaoImp dao=null;
	
	@BeforeAll
	public static void before() {
	 Booking b1=new Booking();
	 
	}
	
	

	@Test
	void testAddBooking() {
		fail("Not yet implemented");
	}

	@Test
	void testModifyBooking() {
		fail("Not yet implemented");
	}

}
