package com.job.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ApiResponse {
	private String msg;
	private LocalDate timestamp;
	
	public ApiResponse(String message) {
		this.msg = message;
		this.timestamp = LocalDate.now();
	}
}
