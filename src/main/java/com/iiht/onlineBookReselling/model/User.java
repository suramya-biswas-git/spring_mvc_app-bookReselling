package com.iiht.onlineBookReselling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "USER")   
public class User {
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CITY")
	private String city;
	@Column(name="PIN")
	private Integer pin;
	@Column(name="STATE")
	private String state;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="MOBILE")
	private Long mobile;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(Integer userId, String userName, String address, String city, Integer pin, String state, String email,
			String password, Long mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public User(Integer userId, String email, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	public User(String userName, String address, String city, Integer pin, String state, String email, String password,
			Long mobile) {
		super();
		this.userName = userName;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public User(Integer userId, String email, Long mobile) {
		super();
		this.userId = userId;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", city=" + city
				+ ", pin=" + pin + ", state=" + state + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + "]";
	}
	
	
	

}
