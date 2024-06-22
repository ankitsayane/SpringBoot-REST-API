package com.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auto.dto.VehicleDTO;
import com.auto.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<?> addVehicle(@RequestBody VehicleDTO vehicle){
		return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.addNewVehicle(vehicle));
	}
	
	@GetMapping("/users/{uname}")
	public ResponseEntity<?> getVehicleByUname(@PathVariable String uname){
		return ResponseEntity.ok(vehicleService.getVehByName(uname));
	}
	
	@DeleteMapping("/users/{uname}")
	public ResponseEntity<?> deleteVehicleByUname(@PathVariable String uname){
		vehicleService.deleteFromVehicle(uname);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
