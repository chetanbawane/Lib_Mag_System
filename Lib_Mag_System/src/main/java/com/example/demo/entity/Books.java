package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BookID ; 
	@Column
	private String Title ;
	@Column
	private String Categories ;
	
	@ManyToOne
	@JoinColumn(name = "AuthorID", nullable = false)
	private Authors authors;
	
	@OneToMany(mappedBy = "books", cascade = CascadeType.ALL)
	private List<Books> booklist;

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getCategories() {
		return Categories;
	}

	public void setCategories(String categories) {
		Categories = categories;
	}

	public Authors getAuthors() {
		return authors;
	}

	public void setAuthors(Authors authors) {
		this.authors = authors;
	}
	
	
}
