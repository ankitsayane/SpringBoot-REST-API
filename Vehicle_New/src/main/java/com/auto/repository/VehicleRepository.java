package com.auto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	List<Vehicle> findByUser_Uname(String uname);
	
	void deleteByUser_Uname(String name);
}
