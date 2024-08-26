package com.example.demo.repoimpl;

import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Room;
import com.example.demo.repo.RoomRepo;

import java.util.List;

@Repository
public class RoomRepoImpl implements RoomRepo {

	@Autowired
	EntityManager entityMan;

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Room> getRoomDetails() {
//		return entityMan.createQuery("from Room").getResultList();
//	}

	public Room findById(int id) {
		return entityMan.find(Room.class, id);
	}

	public Room regRoom(Room application) {

		entityMan.persist(application);
		return application;
	}

//	public Room updateRooms(Room application) {
//	    try {
//	        // Fetch existing policy from the database
//	    	Room existingRoom = entityMan.find(Room.class, application.getId());
// 
//	        if (existingRoom != null) {
//	            // Update fields of the existing policy
////	            existingRoom.setRoomNumber(application.getRoomNumber());
////	            existingRoom.setRoomType(application.getRoomType());
////	            existingRoom.setRoomDescription(application.getRoomDescription());
////	            existingRoom.setPrice(application.getPrice());
//	            entityMan.merge(existingRoom);
//	            return existingRoom;
//	        } else {
//	            return null;
//	        }
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }
//	    return null;
//	}
	@Override
	public List<Room> findAll() {
		String hql = "from Room";
		Query query = entityMan.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public boolean deleteRooms(int id) {
		Query query = entityMan.createQuery("DELETE Room p WHERE p.id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
		return true;
	}

	public Room updateRooms(Room application) {

		return entityMan.merge(application);

	}

}