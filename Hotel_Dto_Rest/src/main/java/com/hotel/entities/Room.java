package com.hotel.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hotel_room")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Room {
	//Room ID, room number, type (single, double, suite), price, availability.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "room_id")
	private Long roomId;
	
	@Column(name = "room_no")
	private int roomNo;
	
	@Column(name = "room_type")
	@Enumerated(EnumType.STRING)
	private Type roomType;
	
	@Column(name = "room_price")
	private double roomPrice;
	
	private boolean availability;

	public Room(int roomNo, Type roomType, double roomPrice, boolean availability) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.availability = availability;
	}
	
	
	

}
