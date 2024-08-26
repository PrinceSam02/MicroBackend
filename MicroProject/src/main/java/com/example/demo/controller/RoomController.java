package com.example.demo.controller;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;

@RestController
@CrossOrigin("*")
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService roomService;

//	@PostMapping("/createRoom")
//    public Room regRoom(@RequestBody Room room) throws IOException {
//        return roomService.regRoom(room);
	@PostMapping("/createRoom")
	public ResponseEntity<String> submitRoom(	
			@RequestParam("roomNumber") String roomNumber,
			@RequestParam("roomName") String roomName,
			@RequestParam("roomType") String roomType,
			@RequestParam("roomDescription") String roomDescription,
			@RequestParam("price") String price,
			@RequestParam("roomPhoto") MultipartFile roomPhoto)
			
	{
		try
	{
		Room room = new Room();
		
		room.setRoomNumber(roomNumber);
		room.setRoomName(roomName);
		room.setRoomType(roomType);
		room.setRoomDescription(roomDescription);
		room.setPrice(price) ;
		room.setRoomPhoto(roomPhoto.getBytes());
//		
		roomService.regRoom(room);
		return ResponseEntity.ok("Room submitted successfully!");
		}
		catch
		(IOException e)
		{
			e.printStackTrace();
		return ResponseEntity.status(500).body("Failed to upload files.");
		}
		}

	@GetMapping("/all")
	public List<Room> getRoom() {
		return roomService.getAllRoom();

	}

	@GetMapping("/GetRoomId/{id}")
	public Room find(@PathVariable("id") int id) {
		return roomService.find(id);
	}

	@PutMapping("/doRoomDetailsUpdate")
	public Room updateRoom(@RequestBody Room room) {
		return roomService.updateRoom(room);
	}
//	@PostMapping("/updateStatus")
//	public ResponseEntity<?> UpdateStatus(@RequestParam int roomId, @RequestParam String status) {
// 
//		try {
//			roomService.updateRoom(roomId, status);
//			return ResponseEntity.ok("Success");
//		} catch (Exception e) {
//			
//			return ResponseEntity.badRequest().body("failed");
//		}
// 
//	}
	
	public ResponseEntity<String> updateRoom(	
			@RequestParam("roomNumber") String roomNumber,
			@RequestParam("roomName") String roomName,
			@RequestParam("roomType") String roomType,
			@RequestParam("roomDescription") String roomDescription,
			@RequestParam("price") String price,
			@RequestParam("roomPhoto") MultipartFile roomPhoto)
			
	{
		try
	{
		Room room = new Room();
		
		room.setRoomNumber(roomNumber);
		room.setRoomName(roomName);
		room.setRoomType(roomType);
		room.setRoomDescription(roomDescription);
		room.setPrice(price) ;
		room.setRoomPhoto(roomPhoto.getBytes());
		System.out.println(roomPhoto.getBytes());
		roomService.updateRoom(room);
		return ResponseEntity.ok("Room submsuccessfullyitted !");
		}
		catch
		(IOException e)
		{
			e.printStackTrace();
		return ResponseEntity.status(500).body("Failed to upload files.");
		}
		}

	@DeleteMapping("/deleteRoom/{id}")
	public boolean deleteRooms(@PathVariable("id") int id) {
		return roomService.deleteRoom(id);

	}
}