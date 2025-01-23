package com.example.demo.Dao;

import jakarta.persistence.Column;

public class BookDao {

	private String Title ;
	private String Categories ;
	
	public BookDao(String title, String categories) {
		super();
		Title = title;
		Categories = categories;
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
	
	
	
}
