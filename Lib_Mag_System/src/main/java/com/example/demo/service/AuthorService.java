package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Authors;
import com.example.demo.repos.AuthorsRepos;

@Service
public class AuthorService {


	    @Autowired
	    private AuthorsRepos authorRepository;

	    public List<Authors> getAllAuthors() {
	        return authorRepository.findAll();
	    }

	    public Authors getAuthorById(int id) {
	        return authorRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + id));
	    }

	   
	    public Authors createAuthor(Authors author) {
	        return authorRepository.save(author);
	    }

	    public Authors updateAuthor(int id, Authors authorDetails) {
	        Authors existingAuthor = authorRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + id));
	        existingAuthor.setName(authorDetails.getName());
	        existingAuthor.setText(authorDetails.getText());
	        existingAuthor.setBookList(authorDetails.getBookList());
	        return authorRepository.save(existingAuthor);
	    }

	    public void deleteAuthor(int id) {
	        Authors existingAuthor = authorRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + id));
	        authorRepository.delete(existingAuthor);
	    }
	}


