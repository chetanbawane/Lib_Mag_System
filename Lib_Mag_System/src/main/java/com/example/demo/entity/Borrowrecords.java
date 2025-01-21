package com.example.demo.entity;

import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Borrowrecords {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RecordID ; 
	
	@ManyToOne
	@JoinColumn(name = "UserID")
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "BookID")
	private Books books ;
	
	private Date  BorrowDate, ReturnDate ;
	
	private int activebooks ;

	public int getRecordID() {
		return RecordID;
	}

	public void setRecordID(int recordID) {
		RecordID = recordID;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Date getBorrowDate() {
		return BorrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		BorrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}

	public int getActivebooks() {
		return activebooks;
	}

	public void setActivebooks(int activebooks) {
		this.activebooks = activebooks;
	}
	
	
}
