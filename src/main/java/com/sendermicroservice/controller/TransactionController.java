package com.sendermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendermicroservice.entities.Transaction;
import com.sendermicroservice.service.TransactionService;

@RestController
@RequestMapping("/transactions")

public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping(path="/sender")
	public ResponseEntity<Transaction> encryptTransactionObject(@RequestBody Transaction transactionObj) {
		
		 return transactionService.sendTransaction(transactionObj);
	}
	
}
