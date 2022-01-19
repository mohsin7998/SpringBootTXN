package com.pral.tr.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pral.tr.entity.TransactionMasterEntity;
import com.pral.tr.service.TransactionMasterEntityService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionMasterEntityService transactionMasterEntityService;
	
	@GetMapping("/api/transaction/{transactionNo}")
	public Optional<TransactionMasterEntity> getTransactionDetails(@PathVariable("transactionNo") Integer transactionNo) {
		return transactionMasterEntityService.findById(transactionNo);
	}
	
	@PostMapping("/api/transaction/performTransaction")
	public void performTransaction(@RequestBody String transactionType) {
		transactionMasterEntityService.performTransaction(transactionType);
	}
}
