package com.capgemini.flightmanagement.ui;

import java.util.List;
import java.util.Scanner;

import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.service.BookingServiceImp;
import com.capgemini.flightmanagement.service.IBookingService;

public class Ui {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IBookingService bookingservice = new BookingServiceImp();
		int choice = 0;
		Booking booking = null;
		List<Booking> list = null;

		while (choice != 6) {
			System.out.println("Add Booking");
			System.out.println("Modify Booking");
			System.out.println("View List of BookingId");
			System.out.println("View List of all Bookings");
			System.out.println("Delete Booking");
			System.out.println("Exit");
			System.out.println("Enter your choice");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Booking details:");
				System.out.println("");

				break;
			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;
			case 6:

				System.out.println("Thank you");
				
				return;

			}
		}

	}

}
