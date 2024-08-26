//
//package com.example.demo.serviceimpl;
// 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.demo.model.Booking;
//import com.example.demo.repo.BookingRepo;
//import com.example.demo.service.BookingService;
// 
//@Service
//public class BookingServiceImpl implements BookingService {
// 
//    @Autowired
//    private BookingRepo bookingRepository;
// 
//    @Override
//    public Booking saveBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//}

package com.example.demo.serviceimpl;

import com.example.demo.model.Booking;
import com.example.demo.repo.BookingRepo;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepository;

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking updateBooking(Booking booking) {
        if (bookingRepository.existsById(booking.getId())) {
            return bookingRepository.save(booking);
        } else {
            throw new IllegalArgumentException("Booking not found");
        }
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

	@Override
	public List<Booking> getPendingBooking() {
		return bookingRepository.findAll();
	}
	
	@Override
	public void updateBookingStatus(Booking booking) {
	   bookingRepository.save(booking);
	}
}
