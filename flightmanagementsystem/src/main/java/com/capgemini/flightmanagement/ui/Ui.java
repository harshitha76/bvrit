package com.capgemini.flightmanagement.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.capgemini.exceptions.BookingException;
import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.beans.Flight;
import com.capgemini.flightmanagement.beans.User;
import com.capgemini.flightmanagement.service.BookingServiceImp;
import com.capgemini.flightmanagement.service.IBookingService;

public class Ui {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		IBookingService bookingservice=new BookingServiceImp();
		int choice=0;
		Booking booking=null;
		List<Booking> list=null;
		User u1=new User("User", 101, "Harshitha", "h590", 264288, "gharshitha76@gmail.com");
		Flight f3= new Flight(1003,"FIRSTCLASS","INS Vikramadithya",50);
		
		while(choice!=3)
		{
			System.out.println("1.Add Booking");
			System.out.println("2.Modify Booking");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int a=u1.getUserId();
				LocalDate l1=LocalDate.now();
				System.out.println("Enter number of passengers");
				int d1=sc.nextInt();
				sc.nextLine();
				double t1=d1*2500.0;

				booking=new Booking();
				booking.setUserId(u1);
				booking.setBookingDate(l1);
				booking.setFlight(f3);
				booking.setTicketCost(t1);
				booking.setNoOfPassengers(d1);                                                                                                                                                                                             
				
				try
				{
					Booking b=bookingservice.addBooking(booking);
					int id=b.getBookingId();
					System.out.println("Your /Booking id is"+id);
				}
				catch(BookingException e)
				{
					System.err.println(e.getMessage());
				}
				break;
				
			case 2:
				System.out.println("enter booking id to modify");
				int ab=sc.nextInt();
				try
				{
				System.out.println("new number of passenger");
				int noOfPassengers=sc.nextInt();
				booking=bookingservice.modifyBooking(booking);
				System.out.println("modified successfully");
				}
				catch(BookingException e)
				{
				System.err.println(e.getMessage());
				}
				break;

			case 3:

				System.out.println("Thank you");
				
				return;

			}
		}

	}

}
