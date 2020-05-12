package com.cg.realestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(unique=true)
	@NotNull(message = "name should not be null")
	@Pattern(regexp = "^[A-Za-z]*$",message = "Name must be alphabet")
	private String userName;
    @Column(unique=true)
    @NotEmpty @Email
	private String emailId;
	@Column(unique=true)
	@Size( min = 10 , max = 10)
	private String phoneNo;
	

	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String userName, String emailId, String phoneNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		
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
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", EmailId=" + emailId + ", phoneNo=" + phoneNo +  "]";
	}
	
	
	
}
