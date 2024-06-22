package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	public RoomController() {
		System.out.println("IN ROOM CONTROLLER CTOR");
	}
	
	@GetMapping(params = "available=yes")
	public ResponseEntity<?> getAllrooms(){
		return ResponseEntity.ok(roomService.getAvaiRooms());
	}

}
