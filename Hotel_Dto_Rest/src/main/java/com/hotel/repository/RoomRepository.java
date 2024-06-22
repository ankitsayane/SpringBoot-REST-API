package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	List<Room> findByAvailability(boolean availability);
}
