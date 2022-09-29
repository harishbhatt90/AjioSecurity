package com.example.demo.payload.request;

import java.util.Set;

import lombok.Data;

@Data
public class  SignupRequest {
	private String UserName;
	private String Email;
	private String Password;
	private String Role;

	public SignupRequest() {
		// TODO Auto-generated constructor stub
	}
	public SignupRequest(String userName, String email, String password) {
		super();
		UserName = userName;
		Email = email;
		Password = password;
	}

    public String getUsername() {
		return this.UserName;
    }
}
