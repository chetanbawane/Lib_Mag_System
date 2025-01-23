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

import com.example.demo.entity.Borrowrecords;
import com.example.demo.service.BorrowrecordService;

@RestController
@RequestMapping("/api/borrowrecords")
public class BorrowrecordController {
	

	    @Autowired
	    private BorrowrecordService borrowrecordsService;

	    @GetMapping
	    public List<Borrowrecords> getAllBorrowrecords() {
	        return borrowrecordsService.getAllBorrowrecords();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Borrowrecords> getBorrowrecordById(@PathVariable int id) {
	        return ResponseEntity.ok(borrowrecordsService.getBorrowrecordById(id));
	    }

	    @PostMapping
	    public ResponseEntity<Borrowrecords> createBorrowrecord(@RequestBody Borrowrecords borrowrecord) {
	        return ResponseEntity.ok(borrowrecordsService.createBorrowrecord(borrowrecord));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Borrowrecords> updateBorrowrecord(@PathVariable int id, @RequestBody Borrowrecords borrowrecordDetails) {
	        return ResponseEntity.ok(borrowrecordsService.updateBorrowrecord(id, borrowrecordDetails));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBorrowrecord(@PathVariable int id) {
	        borrowrecordsService.deleteBorrowrecord(id);
	        return ResponseEntity.noContent().build();
	    }
	}


