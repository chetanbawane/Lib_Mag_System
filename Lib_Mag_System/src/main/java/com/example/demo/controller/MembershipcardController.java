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

import com.example.demo.entity.Membershipcard;
import com.example.demo.service.MembershipcardService;

@RestController
@RequestMapping("/api/membershipcards")
public class MembershipcardController {

	    @Autowired
	    private MembershipcardService membershipcardService;

	    @GetMapping
	    public List<Membershipcard> getAllMembershipcards() {
	        return membershipcardService.getAllMembershipcards();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Membershipcard> getMembershipcardById(@PathVariable int id) {
	        return ResponseEntity.ok(membershipcardService.getMembershipcardById(id));
	    }

	    @PostMapping
	    public ResponseEntity<Membershipcard> createMembershipcard(@RequestBody Membershipcard membershipcard) {
	        return ResponseEntity.ok(membershipcardService.createMembershipcard(membershipcard));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Membershipcard> updateMembershipcard(@PathVariable int id, @RequestBody Membershipcard membershipcardDetails) {
	        return ResponseEntity.ok(membershipcardService.updateMembershipcard(id, membershipcardDetails));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteMembershipcard(@PathVariable int id) {
	        membershipcardService.deleteMembershipcard(id);
	        return ResponseEntity.noContent().build();
	    }
	}


