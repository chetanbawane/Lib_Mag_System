package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserID ;
	@Column
	private String Name ;
	@Column
	private String Email ; 
	@Column
	private String Phone ;
	@Column
	private String Address ;
	@Column
	private String Role ;
	
	@OneToMany(mappedBy = "users")
	private List<Membershipcard> membershipcard;
	
	@OneToMany(mappedBy = "users")
	private List<Borrowrecords> borrowrecords;

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public List<Membershipcard> getMembershipcard() {
		return membershipcard;
	}

	public void setMembershipcard(List<Membershipcard> membershipcard) {
		this.membershipcard = membershipcard;
	}

	public List<Borrowrecords> getBorrowrecords() {
		return borrowrecords;
	}

	public void setBorrowrecords(List<Borrowrecords> borrowrecords) {
		this.borrowrecords = borrowrecords;
	}
	
	
	
	
}
