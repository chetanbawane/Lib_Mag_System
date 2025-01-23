package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Borrowrecords;
import com.example.demo.repos.BorrowrecordsRepos;

@Service
public class BorrowrecordService {

	    @Autowired
	    private BorrowrecordsRepos borrowrecordsRepository;

	    public List<Borrowrecords> getAllBorrowrecords() {
	        return borrowrecordsRepository.findAll();
	    }

	    public Borrowrecords getBorrowrecordById(int id) {
	        return borrowrecordsRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Borrow record not found with ID: " + id));
	    }

	    public Borrowrecords createBorrowrecord(Borrowrecords borrowrecord) {
	        return borrowrecordsRepository.save(borrowrecord);
	    }

	    public Borrowrecords updateBorrowrecord(int id, Borrowrecords borrowrecordDetails) {
	        Borrowrecords existingRecord = borrowrecordsRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Borrow record not found with ID: " + id));
	        existingRecord.setUsers(borrowrecordDetails.getUsers());
	        existingRecord.setBooks(borrowrecordDetails.getBooks());
	        existingRecord.setBorrowDate(borrowrecordDetails.getBorrowDate());
	        existingRecord.setReturnDate(borrowrecordDetails.getReturnDate());
	        existingRecord.setActivebooks(borrowrecordDetails.getActivebooks());
	        return borrowrecordsRepository.save(existingRecord);
	    }

	    public void deleteBorrowrecord(int id) {
	        Borrowrecords existingRecord = borrowrecordsRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Borrow record not found with ID: " + id));
	        borrowrecordsRepository.delete(existingRecord);
	    }
	
}
