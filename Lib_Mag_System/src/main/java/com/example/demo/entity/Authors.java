package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Authors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AuthorID ;
	@Column
	@JsonProperty("Name")
	private String Name ;
	@Column
	@JsonProperty("Bio")
	private String Bio ;
	
	@OneToMany(mappedBy = "authors",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Books> bookList;

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getText() {
		return Bio;
	}

	public void setText(String Bio) {
		this.Bio = Bio;
	}

	public List<Books> getBookList() {
		return bookList;
	}

	public void setBookList(List<Books> bookList) {
		this.bookList = bookList;
	}
	
	
	
	
}
