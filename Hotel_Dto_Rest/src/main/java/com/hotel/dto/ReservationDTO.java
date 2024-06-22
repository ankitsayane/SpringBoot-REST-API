package com.hotel.dto;

import java.time.LocalDate;

import com.hotel.entities.Room;

public class ReservationDTO {
	
	private String gname;
	
	private LocalDate checkindate;
	
	private LocalDate checkoutdate;
	
	private Room roomid;
	
	private double totalPrice;

	public ReservationDTO(String gname, LocalDate checkindate, LocalDate checkoutdate, Room roomid, double totalPrice) {
		super();
		this.gname = gname;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.roomid = roomid;
		this.totalPrice = totalPrice;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public LocalDate getCheckindate() {
		return checkindate;
	}

	public void setCheckindate(LocalDate checkindate) {
		this.checkindate = checkindate;
	}

	public LocalDate getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(LocalDate checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public Room getRoomid() {
		return roomid;
	}

	public void setRoomid(Room roomid) {
		this.roomid = roomid;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
