package com.sendermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sendermicroservice.encryption.EncryptObject;
import com.sendermicroservice.entities.Transaction;

@Service
public class TransactionService {

	private final RestTemplate restTemplate = new RestTemplate();
	public ResponseEntity<Transaction> sendTransaction(Transaction t) {
		t.setAccountNumber(EncryptObject.encrypt(t.getAccountNumber()));
		t.setAccountFrom(EncryptObject.encrypt(t.getAccountFrom()));
		t.setAmount(EncryptObject.encrypt(t.getAmount()));
		t.setcurrency(EncryptObject.encrypt(t.getcurrency()));
		t.setType(EncryptObject.encrypt(t.getType()));
		
		System.out.println("Sender Obj"+t.toString());
		String receiverURL ="https://receiver-api-app.herokuapp.com/receiverTransactions/receiver";
		return restTemplate.postForEntity(receiverURL, t, Transaction.class);
		
	}
}
