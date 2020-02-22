package com.capgemini.flightmanagement.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.exceptions.BookingException;
import com.capgemini.flightmanagement.beans.Airport;
import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.beans.DateTime;
import com.capgemini.flightmanagement.beans.Flight;
import com.capgemini.flightmanagement.beans.Schedule;
import com.capgemini.flightmanagement.beans.ScheduledFlight;
import com.capgemini.flightmanagement.beans.User;

public class BookingDaoImp implements IBookingDao {

	private List<Booking> bookingList;
	private List<ScheduledFlight> listOfScheduledFlight;

	public BookingDaoImp() {
		bookingList = new ArrayList<Booking>();
		listOfScheduledFlight = new ArrayList<ScheduledFlight>();
		Flight f1 = new Flight(1001, "BUSSINESS", "INS Vikramaditya", 100);
		Flight f2 = new Flight(1002, "ECONOMY", "INS Vikramaditya", 70);
		Flight f3 = new Flight(1003, "FIRSTCLASS", "INS Vikramaditya", 50);

		Airport s1 = new Airport("Rajiv Gandhi International Airport", "HYD", "Hyderabad");
		Airport s2 = new Airport("Chennai International Airport", "MAA", "Chennai");
		Airport s3 = new Airport("Dabolim Airport", "GOI", "Goa");

		Airport d1 = new Airport("Dabolim Airport", "GOI", "Goa");
		Airport d2 = new Airport("Rajiv Gandhi International Airport", "HYD", "Hyderabad");
		Airport d3 = new Airport("Chennai International Airport", "MAA", "Chennai");

		DateTime date1 = new DateTime("01-03-2020", "05:00");
		DateTime date2 = new DateTime("03-03-2020", "07:00");
		DateTime date3 = new DateTime("05-03-2020", "10:00");
		DateTime date4 = new DateTime("07-03-2020", "11:00");
		DateTime date5 = new DateTime("10-03-2020", "12:00");

		Schedule sch1 = new Schedule(s1, d1, date1, date4);
		Schedule sch2 = new Schedule(s2, d2, date2, date3);
		Schedule sch3 = new Schedule(s3, d3, date3, date5);

		ScheduledFlight scdf1 = new ScheduledFlight(f1, 100, sch1);
		ScheduledFlight scdf2 = new ScheduledFlight(f2, 70, sch2);
		ScheduledFlight scdf3 = new ScheduledFlight(f3, 50, sch3);

		listOfScheduledFlight.add(scdf1);
		listOfScheduledFlight.add(scdf2);
		listOfScheduledFlight.add(scdf3);

		User u1 = new User("User", 101, "Harshitha", "h590", 264288, "gharshitha76@gmail.com");
		User u2 = new User("User", 102, "Vani", "v5b6", 284288, "vani123@gmail.com");
		User u3 = new User("User", 103, "ramya", "rc0", 1234, "ramya1@gmail.com");

		Booking b1 = new Booking(4589, u1, LocalDate.now(), 5000.0, f1, 3);
		Booking b2 = new Booking(5615, u2, LocalDate.now(), 4000.0, f2, 2);

		bookingList.add(b1);
		bookingList.add(b2);

	}

	public Booking addBooking(Booking booking) throws BookingException {

		if (booking != null) {
			boolean flag = listOfScheduledFlight.stream().anyMatch(p -> p.getFlight().getFlightNumber() == booking.getFlight().getFlightNumber()&& p.getAvailableSeats() >= booking.getNoOfPassengers());
			if (flag) {
				bookingList.add(booking);
				List<ScheduledFlight> a = listOfScheduledFlight.stream().filter(p -> p.getFlight().getFlightNumber() == booking.getFlight().getFlightNumber() ? true : false).collect(Collectors.toList());
				for (ScheduledFlight l : a) {
					l.setAvailableSeats(l.getAvailableSeats() - booking.getNoOfPassengers());
				}
			}
		} else {
			throw new BookingException("Booking details cannot be null");
		}
		return booking;

	}

	public Booking modifyBooking(Booking booking) throws BookingException {

		if (booking != null) {
			boolean flag = bookingList.stream().anyMatch(p -> p.getBookingId() == booking.getBookingId());
			if (flag == true) {
				booking.setNoOfPassengers(booking.getNoOfPassengers());
			} else {
				throw new BookingException("BookingId not found");
			}
		}

		return booking;
	}

}
