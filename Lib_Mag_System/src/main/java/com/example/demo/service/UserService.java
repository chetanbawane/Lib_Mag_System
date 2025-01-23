package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repos.UsersRepos;

@Service
public class UserService {

	    @Autowired
	    private UsersRepos userRepository;

	 
	    public List<Users> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Users getUserById(int id) {
	        return userRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
	    }

	    
	    public Users createUser(Users user) {
	        return userRepository.save(user);
	    }

	    public Users updateUser(int id, Users userDetails) {
	        Users existingUser = userRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
	        existingUser.setName(userDetails.getName());
	        existingUser.setEmail(userDetails.getEmail());
	        existingUser.setPhone(userDetails.getPhone());
	        existingUser.setAddress(userDetails.getAddress());
	        existingUser.setRole(userDetails.getRole());
	        return userRepository.save(existingUser);
	    }

	    public void deleteUser(int id) {
	        Users existingUser = userRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
	        userRepository.delete(existingUser);
	    }
	}

