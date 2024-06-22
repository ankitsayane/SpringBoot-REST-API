package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.dto.APIResponse;
import com.hotel.dto.ReservationDTO;
import com.hotel.entities.Reservation;
import com.hotel.entities.Room;
import com.hotel.exceptions.ResourceNotFoundException;
import com.hotel.repository.ReservationRepository;
import com.hotel.repository.RoomRepository;

@Service
@Transactional
public class ReservationServiceImplementation implements ReservationService {
	
	@Autowired
	private ReservationRepository reservRepo;
	@Autowired
	private RoomRepository roomRepo;

	@Override
	public Reservation createReservation(ReservationDTO reservation) {
		Room room = roomRepo.findById(reservation.getRoomid().getRoomId())
				.orElseThrow(()-> new ResourceNotFoundException("Invalid Room Id"));
		if(!room.isAvailability()) {
			throw new ResourceNotFoundException("Room Not Available");	
		}
		room.setAvailability(false);
		Reservation reserv = new Reservation();
		reserv.setGname(reservation.getGname());
		reserv.setCheckindate(reservation.getCheckindate());
		reserv.setCheckoutdate(reservation.getCheckoutdate());
		reserv.setRoomid(reservation.getRoomid());
		reserv.setTotalPrice(reservation.getTotalPrice());
		
		return reservRepo.save(reserv);
	}

	@Override
	public APIResponse cancelReservation(Long id) {
		Reservation r = reservRepo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Invalid Reservation id"));
		
		r.getRoomid().setAvailability(true);
		reservRepo.delete(r);
		return new APIResponse("Reservation Cancled with ID - "+id);
	}

}
