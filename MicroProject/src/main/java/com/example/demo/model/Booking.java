package com.example.demo.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int userAge;
    private String address;
    private String phoneNumber;
    private String email;
    private String numAdults;
    private int totalDays;
    private String numChildren;
 
    private String totalGuests;
    private String roomType;
    
    private String price;
    @Lob
    @Column(name = "idProof",length = 100000000)
    
    private byte[] proofCard;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    
    private String bookingStatus;
    private String paymentStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumAdults() {
		return numAdults;
	}
	public void setNumAdults(String numAdults) {
		this.numAdults = numAdults;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public String getNumChildren() {
		return numChildren;
	}
	public void setNumChildren(String numChildren) {
		this.numChildren = numChildren;
	}
	public String getTotalGuests() {
		return totalGuests;
	}
	public void setTotalGuests(String totalGuests) {
		this.totalGuests = totalGuests;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public byte[] getProofCard() {
		return proofCard;
	}
	public void setProofCard(byte[] proofCard) {
		this.proofCard = proofCard;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Booking(Long id, String firstName, String lastName, int userAge, String address, String phoneNumber,
			String email, String numAdults, int totalDays, String numChildren, String totalGuests, String roomType,
			String price, byte[] proofCard, User user, Room room, String bookingStatus, String paymentStatus) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userAge = userAge;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.numAdults = numAdults;
		this.totalDays = totalDays;
		this.numChildren = numChildren;
		this.totalGuests = totalGuests;
		this.roomType = roomType;
		this.price = price;
		this.proofCard = proofCard;
		this.user = user;
		this.room = room;
		this.bookingStatus = bookingStatus;
		this.paymentStatus = paymentStatus;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userAge=" + userAge
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", numAdults="
				+ numAdults + ", totalDays=" + totalDays + ", numChildren=" + numChildren + ", totalGuests="
				+ totalGuests + ", roomType=" + roomType + ", price=" + price + ", proofCard="
				+ Arrays.toString(proofCard) + ", user=" + user + ", room=" + room + ", bookingStatus=" + bookingStatus
				+ ", paymentStatus=" + paymentStatus + "]";
	}
	
}