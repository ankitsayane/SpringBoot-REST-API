package com.hotel.dto;

import java.time.LocalDateTime;

public class APIResponse {
	private String msg;
	private LocalDateTime ts;
	public APIResponse(String msg) {
		this.msg = msg;
		this.ts = LocalDateTime.now();
	}

}
