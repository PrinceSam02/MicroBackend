package com.example.demo.service;

import com.example.demo.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    Booking saveBooking(Booking booking);
    Optional<Booking> getBookingById(Long id);
    List<Booking> getAllBookings();
    Booking updateBooking(Booking booking);
    void deleteBooking(Long id);
	List<Booking> getPendingBooking();
	public void updateBookingStatus(Booking booking);
}
