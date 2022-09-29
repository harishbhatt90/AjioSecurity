package com.example.demo.payload.request;

import lombok.Data;

@Data
public class LoginRequest {

	private String UserName;
	private String Password;
	public LoginRequest(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
	public LoginRequest() {
	}

    public Object getUsername() {
		return this.UserName;
    }
}
