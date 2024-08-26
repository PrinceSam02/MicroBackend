
package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.model.User;
import com.example.demo.service.BookingService;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private UserService userService;  // Inject UserService or use UserRepository

    @PostMapping("/create")
    public ResponseEntity<String> createBooking(
            @RequestParam("userId") int id,  
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("userAge") int userAge,
            @RequestParam("address") String address,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("email") String email,
            @RequestParam("numAdults") String numAdults,
            @RequestParam("numChildren") String numChildren,
            @RequestParam("totalGuests") String totalGuests,
            @RequestParam("totalDays") int totalDays,
            @RequestParam("roomType") String roomType,
            @RequestParam("price") String price,
            @RequestParam("proofCard") MultipartFile proofCard,
            @RequestParam("bookingStatus") String bookingStatus,
            @RequestParam("paymentStatus") String paymentStatus) {

        try {
             
            Optional<User> user = userService.getUserById(id);
            if (!user.isPresent()) {
                return ResponseEntity.status(404).body("User not found");
            }

            Booking booking = new Booking();
            booking.setUser(user.get());  // Set the User in the Booking
            booking.setFirstName(firstName);
            booking.setLastName(lastName);
            booking.setUserAge(userAge);
            booking.setAddress(address);
            booking.setPhoneNumber(phoneNumber);
            booking.setEmail(email);
            booking.setNumAdults(numAdults);
            booking.setNumChildren(numChildren);
            booking.setTotalGuests(totalGuests);
            booking.setTotalDays(totalDays);
            booking.setRoomType(roomType);
            booking.setPrice(price);
            booking.setBookingStatus(bookingStatus);
            booking.setPaymentStatus(paymentStatus);
            booking.setProofCard(proofCard.getBytes());

            bookingService.saveBooking(booking);

            return ResponseEntity.ok("Booking successful");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while processing the booking");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBooking(@PathVariable Long id) {
        Optional<Booking> booking = bookingService.getBookingById(id);
        return booking.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }

    @PutMapping("/update")
    public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking) {
        try {
            Booking updatedBooking = bookingService.updateBooking(booking);
            return ResponseEntity.ok(updatedBooking);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable Long id) {
        try {
            bookingService.deleteBooking(id);
            return ResponseEntity.ok("Booking deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred while deleting the booking");
        }
    }
    
    @PutMapping("/updateBookingStatus")
    public ResponseEntity<Object> updateBookingStatus(@RequestBody Booking booking) {
    	try {
    		bookingService.updateBookingStatus(booking);
    		return ResponseEntity.ok().build();
    	}catch (Exception e) {
			return ResponseEntity.badRequest().body("failure");
		}
    }
    
    
    
}
