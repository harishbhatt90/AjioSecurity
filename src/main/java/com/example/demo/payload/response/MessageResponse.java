package com.example.demo.payload.response;

import lombok.Data;

@Data
public class MessageResponse {

	public MessageResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageResponse(String message) {
		super();
		Message = message;
	}

	private String Message;
}
