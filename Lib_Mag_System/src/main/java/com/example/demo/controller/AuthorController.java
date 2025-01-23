package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Authors;
import com.example.demo.service.AuthorService;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {


	    @Autowired
	    private AuthorService authorService;

	    @GetMapping
	    public List<Authors> getAllAuthors() {
	        return authorService.getAllAuthors();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Authors> getAuthorById(@PathVariable int id) {
	        return ResponseEntity.ok(authorService.getAuthorById(id));
	    }

	    @PostMapping
	    public ResponseEntity<Authors> createAuthor(@RequestBody Authors author) {
	        return ResponseEntity.ok(authorService.createAuthor(author));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Authors> updateAuthor(@PathVariable("id") int id, @RequestBody Authors authorDetails) {
	        return ResponseEntity.ok(authorService.updateAuthor(id, authorDetails));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteAuthor(@PathVariable int id) {
	        authorService.deleteAuthor(id);
	        return ResponseEntity.noContent().build();
	    }
	}

