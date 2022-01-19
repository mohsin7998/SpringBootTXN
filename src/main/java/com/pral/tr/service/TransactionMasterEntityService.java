package com.pral.tr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pral.tr.entity.AuditLogEntity;
import com.pral.tr.entity.TransactionMasterEntity;
import com.pral.tr.repository.AuditLogEntityRepository;
import com.pral.tr.repository.TransactionMasterEntityRepository;

@Service
@Transactional
public class TransactionMasterEntityService {

	@Autowired
	TransactionMasterEntityRepository transactionMasterEntityRepository;

	@Autowired
	AuditLogEntityRepository auditLogEntityRepository;

	public Optional<TransactionMasterEntity> findById(Integer id) {
		return transactionMasterEntityRepository.findById(id);
	}

	public TransactionMasterEntity performTransaction(String transactionType) {
		
		TransactionMasterEntity transactionMasterEntity = new TransactionMasterEntity();
		
		if (transactionType.equals("CREDIT")) {
			transactionMasterEntity.setTransactionType("CREDIT");
			transactionMasterEntity.setInitiatedBy("Mohsin Javaid");
		} else if (transactionType.equals("DEBIT")) {
			transactionMasterEntity.setTransactionType("DEBIT");
			transactionMasterEntity.setInitiatedBy("System");
		}

		transactionMasterEntity =  transactionMasterEntityRepository.save(transactionMasterEntity);

		//Persist Log
		AuditLogEntity auditLogEntity = new AuditLogEntity();
		auditLogEntity.setAuditOperation(transactionMasterEntity.getTransactionType());
		
		auditLogEntityRepository.save(auditLogEntity);
		
		return transactionMasterEntity;
	}
}
