package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.ReservationDTO;
import com.hotel.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservService;
	
	public ReservationController() {
		System.out.println("IN RESERVATION CONTROLLER CTOR");
	}
	
	@PostMapping
	public ResponseEntity<?> addReservation(@RequestBody ReservationDTO reservation){
		return ResponseEntity.status(HttpStatus.CREATED).body(reservService.createReservation(reservation));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteReservation(@RequestParam Long id){
		return ResponseEntity.status(HttpStatus.OK).body(reservService.cancelReservation(id));
	}

}
