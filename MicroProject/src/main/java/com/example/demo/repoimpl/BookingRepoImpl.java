////package com.example.demo.repoimpl;
//// 
//// 
//// 
//// 
////import jakarta.persistence.EntityManager;
//// 
//// 
////import jakarta.persistence.Query;
//// 
//// 
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Repository;
//// 
//// 
////import com.example.demo.model.Booking;
////import com.example.demo.repo.BookingRepo;
//// 
////import java.util.List;
//// 
////@Repository
////public class BookingRepoImpl implements BookingRepo {
//// 
////	@Autowired
////	EntityManager entityMan;
//// 
//////	@SuppressWarnings("unchecked")
//////	@Override
//////	public List<Booking> getBookingDetails() {
//////		return entityMan.createQuery("from Booking").getResultList();
//////	}
//// 
////	public Booking findById(int id) {
////		return entityMan.find(Booking.class, id);
////	}
//// 
////	public Booking regBooking(Booking booking) {
////		
////		entityMan.persist(booking);
////		return booking;
////	}
//// 
//// 
//// 
////	
////	public Booking updateBookings(Booking booking) {
////	    try {
////	        // Fetch existing policy from the database
////	    	Booking existingBooking = entityMan.find(Booking.class, booking.getId());
//// 
////	        if (existingBooking != null) {
////	            // Update fields of the existing policy
////	            existingBooking.setBookingNumber(booking.getBookingNumber());
////	            existingBooking.setBookingType(booking.getBookingType());
////	            existingBooking.setBookingDescription(booking.getBookingDescription());
////	            existingBooking.setPrice(booking.getPrice());
////	            entityMan.merge(existingBooking);
////	            return existingBooking;
////	        } else {
////	            return null;
////	        }
////	    } catch (Exception e) {
////	        e.printStackTrace();
////	    }
////	    return null;
////	}
////	@Override
////	public List<Booking> findAll() {
////		String hql="from Booking";
////		Query query=entityMan.createQuery(hql);
////		
////		return query.getResultList();
////	}
////	@Override
////	public boolean deleteBookings(int id) {
////		Query query = entityMan.createQuery("DELETE Booking p WHERE p.id = :id");
////		query.setParameter("id", id);
////		query.executeUpdate();
////		return true;
////	}
//// 
////	
////	
//// 
////	
//// 
//// 
////	
////}
//package com.example.demo.repoimpl;
// 
// 
// 
// 
//import jakarta.persistence.EntityManager;
// 
// 
//import jakarta.persistence.Query;
// 
// 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
// 
// 
//import com.example.demo.model.Booking;
//import com.example.demo.repo.BookingRepo;
// 
//import java.util.List;
// 
//@Repository
//public class BookingRepoImpl implements BookingRepo {
// 
//	@Autowired
//	EntityManager entityMan;
// 
////	@SuppressWarnings("unchecked")
////	@Override
////	public List<Booking> getBookingDetails() {
////		return entityMan.createQuery("from Booking").getResultList();
////	}
// 
//	public Booking findById(int id) {
//		return entityMan.find(Booking.class, id);
//	}
// 
//	public Booking regBooking(Booking booking) {
//		
//		entityMan.persist(booking);
//		return booking;
//	}
// 
// 
// 
//	
//	public Booking updateBookings(Booking booking) {
//	    try {
//	        // Fetch existing policy from the database
//	    	Booking existingBooking = entityMan.find(Booking.class, booking.getId());
// 
//	        if (existingBooking != null) {
//	            // Update fields of the existing policy
//	            existingBooking.setFirstName(booking.getFirstName());
//	            existingBooking.setLastName(booking.getLastName());
//	            existingBooking.setDob(booking.getDob());
//	            existingBooking.setAddress(booking.getAddress());
//	            existingBooking.setPhoneNumber(booking.getPhoneNumber());
//	            existingBooking.setEmailId(booking.getEmailId());
//	            existingBooking.setAccountType(booking.getAccountType());
//	            entityMan.merge(existingBooking);
//	            return existingBooking;
//	        } else {
//	            return null;
//	        }
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	    return null;
//	}
//	@Override
//	public List<Booking> findAll() {
//		String hql="from Booking";
//		Query query=entityMan.createQuery(hql);
//		
//		return query.getResultList();
//	}
//	@Override
//	public boolean deleteBookings(int id) {
//		Query query = entityMan.createQuery("DELETE Booking p WHERE p.id = :id");
//		query.setParameter("id", id);
//		query.executeUpdate();
//		return true;
//	}
// 
//	
//	
// 
//	
// 
// 
//	
//}


//package com.example.demo.repoimpl;
//import jakarta.persistence.EntityManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class BookingRepoImpl implements BookingRepo {
//	
//	
//	
//}