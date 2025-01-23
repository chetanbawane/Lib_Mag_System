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

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	    @Autowired
	    private UserService userService;

	    @GetMapping
	    public List<Users> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Users> getUserById(@PathVariable int id) {
	        return ResponseEntity.ok(userService.getUserById(id));
	    }

	    @PostMapping
	    public ResponseEntity<Users> createUser(@RequestBody Users user) {
	        return ResponseEntity.ok(userService.createUser(user));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Users> updateUser(@PathVariable int id, @RequestBody Users userDetails) {
	        return ResponseEntity.ok(userService.updateUser(id, userDetails));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }
	}
