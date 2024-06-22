package com.hotel.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hotel_reservation")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "res_id")
	private Long resId;
	
	private String gname;
	
	private LocalDate checkindate;
	
	private LocalDate checkoutdate;
	
	@OneToOne
    @JoinColumn(name = "room_id", nullable = false)
	private Room roomid;
	
	@Column(name = "total_price", nullable = false)
    private double totalPrice;

	public Reservation(String gname, LocalDate checkindate, LocalDate checkoutdate, double totalPrice) {
		super();
		this.gname = gname;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
		this.totalPrice = totalPrice;
	}
	

}
