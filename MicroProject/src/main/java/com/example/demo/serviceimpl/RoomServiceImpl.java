package com.example.demo.serviceimpl;
 
 
import jakarta.transaction.Transactional;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.model.Room;
import com.example.demo.repo.RoomRepo;
import com.example.demo.service.RoomService;
 
import java.io.IOException;
import java.util.List;
 
@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	
	
	    @Autowired
	    private RoomRepo roomRepo;
 
//		@Override
//		public List<Room> getAllRoomsDetails() {
//			return roomRepo.getRoomDetails();
//		}
	    
		@Override
		public Room find(int id) {
			return roomRepo.findById(id);
		}
 
		@Override
		public Room regRoom(Room room) throws IOException  {
			return roomRepo.regRoom(room);
		}
 
	
		public Room updateRoom(Room room)   {
			return roomRepo.updateRooms(room);
		}
 
		@Override
		public boolean deleteRoom(int id) {
			return roomRepo.deleteRooms(id);
		}
 
//		public void updateRoom(int roomId,String status) {
//			
//			boolean flag=true;
//			
//			try {
//				Room room=roomRepo.findById(roomId);
//				if(room != null) {
//					room.setStatus(status);
//					roomRepo.updateRooms(room);
//				}
//				
//			} catch (Exception e) {
//				flag=false;
//			}
//			return;
//		}

		
		public List<Room> getAllRoom(){
			return roomRepo.findAll();
		}
 
		@Override
		public List<Room> getAllRoomsDetails() {
			
			return null;
		}
 
		
		
 
	}