package com.example.demo.entity;

import java.util.List;

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
	private String Name ;
	@Column
	private String text ;
	
	@OneToMany(mappedBy = "authors",cascade = CascadeType.ALL)
	private List<Books> booklList;

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
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Books> getBooklList() {
		return booklList;
	}

	public void setBooklList(List<Books> booklList) {
		this.booklList = booklList;
	}
	
	
	
	
}
