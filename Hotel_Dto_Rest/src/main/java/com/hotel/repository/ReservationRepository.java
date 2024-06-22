package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
