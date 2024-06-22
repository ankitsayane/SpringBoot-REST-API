package com.auto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auto.dto.VehicleDTO;
import com.auto.entities.User;
import com.auto.entities.Vehicle;
import com.auto.exceptions.ResourceNotFoundException;
import com.auto.repository.VehicleRepository;

@Service
@Transactional
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepo;
	@Autowired
	private UserService userService;
	

	public Vehicle addNewVehicle(VehicleDTO vehicle) {
		User user = userService.getUserById(vehicle.getUid());
		if(user==null) {
			throw new ResourceNotFoundException("ID not found");
		}
		Vehicle v = new Vehicle();
		v.setVname(vehicle.getVname());
		v.setVnumber(vehicle.getVnumber());
		v.setVtype(vehicle.getVtype());
		v.setCompany(vehicle.getCompany());
		v.setUser(user);
		return vehicleRepo.save(v);
	}


	public List<Vehicle> getVehByName(String uname) {
		List<Vehicle> v = vehicleRepo.findByUser_Uname(uname);
		if(v.isEmpty()) {
			throw new ResourceNotFoundException("No Vehicle Found");
		}
		return v;
	}


	public void deleteFromVehicle(String uname) {
		List<Vehicle> v = vehicleRepo.findByUser_Uname(uname);
		if(v.isEmpty()) {
			throw new ResourceNotFoundException("No Vehicle Found");
		}
		vehicleRepo.deleteByUser_Uname(uname);
		
	}

}
