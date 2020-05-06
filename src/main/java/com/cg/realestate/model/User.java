package com.cg.realestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column
	private String userName;
    @Column
	private String emailId;
	@Column
    private String password;
	@Column
	private String phoneNo;
	@Column
	private String userType;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String emailId, String password, String phoneNo, String userType) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNo = phoneNo;
		this.userType = userType;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", EmailId=" + emailId + ", password=" + password
				+ ", phoneNo=" + phoneNo + ", userType=" + userType + "]";
	}
	
	
	
}
