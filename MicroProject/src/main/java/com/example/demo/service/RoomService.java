package com.example.demo.service;
 
 
import java.io.IOException;
import java.util.List;
 
 
import com.example.demo.model.Room;
 
 
public interface RoomService {
 
	
	
		List<Room> getAllRoomsDetails();
 
		Room find(int id);
 
		public List<Room> getAllRoom();
		
		Room updateRoom(Room room);
 
		boolean deleteRoom(int id);
 
		Room regRoom(Room room) throws IOException;
 
//		void updateRoom(int roomId, String status);
		
		
		
	}
 