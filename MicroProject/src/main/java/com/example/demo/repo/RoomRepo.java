package com.example.demo.repo;
import java.util.List;
 
 
import com.example.demo.model.Room;
 
 
 
public interface RoomRepo {
 
	
	List<Room> findAll();
	
	public Room findById(int id);
 
	public Room updateRooms(Room room);
 
	public boolean deleteRooms(int id);
 
	public Room regRoom(Room room);
 
 
	
	
	
 
	
 
 
}