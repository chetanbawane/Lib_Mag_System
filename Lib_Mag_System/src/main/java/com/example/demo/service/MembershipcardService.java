package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Membershipcard;
import com.example.demo.repos.MembershipcardRepos;

@Service
public class MembershipcardService {

	    @Autowired
	    private MembershipcardRepos membershipcardRepository;

	    public List<Membershipcard> getAllMembershipcards() {
	        return membershipcardRepository.findAll();
	    }

	    
	    public Membershipcard getMembershipcardById(int id) {
	        return membershipcardRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Membership card not found with ID: " + id));
	    }

	    
	    public Membershipcard createMembershipcard(Membershipcard membershipcard) {
	        return membershipcardRepository.save(membershipcard);
	    }

	    public Membershipcard updateMembershipcard(int id, Membershipcard membershipcardDetails) {
	        Membershipcard existingCard = membershipcardRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Membership card not found with ID: " + id));
	        existingCard.setUsers(membershipcardDetails.getUsers());
	        existingCard.setIssueDate(membershipcardDetails.getIssueDate());
	        existingCard.setExpiryDate(membershipcardDetails.getExpiryDate());
	        return membershipcardRepository.save(existingCard);
	    }

	    public void deleteMembershipcard(int id) {
	        Membershipcard existingCard = membershipcardRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Membership card not found with ID: " + id));
	        membershipcardRepository.delete(existingCard);
	    }
	}


