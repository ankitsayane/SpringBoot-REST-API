package com.hotel.service;

import com.hotel.dto.APIResponse;
import com.hotel.dto.ReservationDTO;
import com.hotel.entities.Reservation;

public interface ReservationService {

	Reservation createReservation(ReservationDTO reservation);

	APIResponse cancelReservation(Long id);

}
