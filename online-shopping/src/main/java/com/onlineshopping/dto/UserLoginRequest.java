package com.onlineshopping.dto;

public class UserLoginRequest {
	
	private String emailId;
	private String password;
	private String role;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserLoginRequest [emailId=" + emailId + ", password=" + password + "]";
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword11() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
