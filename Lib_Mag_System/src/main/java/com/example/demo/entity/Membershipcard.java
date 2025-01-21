package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Membershipcard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CardID ; 
	
	@ManyToOne
	@JoinColumn(name = "UserID")
	private Users users ;
	
	@Temporal(TemporalType.DATE)
	private Date IssueDate;
	
	@Temporal(TemporalType.DATE)
	private Date ExpiryDate ;

	public int getCardID() {
		return CardID;
	}

	public void setCardID(int cardID) {
		CardID = cardID;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(Date issueDate) {
		IssueDate = issueDate;
	}

	public Date getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	
	
}
