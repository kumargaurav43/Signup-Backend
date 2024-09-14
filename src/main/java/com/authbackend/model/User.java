package com.authbackend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
//	private String id;
//	private String name;
//	private String number;
//	private String email;
//	private String street1;
//	private String street2;
//	private String city;
//	private String pincode;
//	private String country;
//	private String password;
	
//	private Long id;
    
    private String name;
    private String number;
    private String email;
    private String street1;
    private String street2;
    private String city;
    private String pincode;
    private String country;
    private String password;
    
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
