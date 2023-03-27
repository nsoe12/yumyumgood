package com.cookpang.app.user.dto;

public class UserDTO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userNickName;
	private String userPhoneNumber;
	private String userEmail;
	private String userAddress;
	private String userSelfIntroduction;
	
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userNickName=" + userNickName + ", userPhoneNumber=" + userPhoneNumber + ", userEmail=" + userEmail
				+ ", userAddress=" + userAddress + ", userSelfIntroduction=" + userSelfIntroduction + "]";
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserSelfIntroduction() {
		return userSelfIntroduction;
	}

	public void setUserSelfIntroduction(String userSelfIntroduction) {
		this.userSelfIntroduction = userSelfIntroduction;
	}

	public UserDTO(){}

	
}









