package com.example.demo.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber;
    private String roomName;
    private String roomType; // e.g., Single, Double
    private String roomDescription;
    private String price;
    @Lob
    @Column(name="roomPhoto",length=100000)
    private byte[] roomPhoto;
    

    @OneToMany(mappedBy = "room")
    private List<Booking> bookings = new ArrayList<>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public String getRoomDescription() {
		return roomDescription;
	}


	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public byte[] getRoomPhoto() {
		return roomPhoto;
	}


	public void setRoomPhoto(byte[] bs) {
		this.roomPhoto = bs;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	

	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	


	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Room(Long id, String roomNumber, String roomName, String roomType, String roomDescription, String price,
			byte[] roomPhoto, List<Booking> bookings) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.roomName = roomName;
		this.roomType = roomType;
		this.roomDescription = roomDescription;
		this.price = price;
		this.roomPhoto = roomPhoto;
		this.bookings = bookings;
	}


	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNumber=" + roomNumber + ", roomName=" + roomName + ", roomType=" + roomType
				+ ", roomDescription=" + roomDescription + ", price=" + price + ", roomPhoto="
				+ Arrays.toString(roomPhoto) + ", bookings=" + bookings + "]";
	}



	
	    
}

