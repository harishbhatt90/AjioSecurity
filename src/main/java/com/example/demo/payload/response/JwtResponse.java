package com.example.demo.payload.response;

import java.util.List;

public class JwtResponse {
	private String accessToken;
	private Long id;
	private String userName;
	private String email;
	private List<String> roles;

	public JwtResponse(String accessToken, Long id, String userName, String email, List<String> roles) {
		super();
		this.accessToken = accessToken;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
