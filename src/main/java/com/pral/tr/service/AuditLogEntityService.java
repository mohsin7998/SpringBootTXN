package com.pral.tr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pral.tr.entity.AuditLogEntity;

import com.pral.tr.repository.AuditLogEntityRepository;

@Service
@Transactional
public class AuditLogEntityService {

	@Autowired
	AuditLogEntityRepository auditLogEntityRepository;
	
	public <S extends AuditLogEntity> S save(S entity) {
		return auditLogEntityRepository.save(entity);
	}

	public Optional<AuditLogEntity> findById(Integer id) {
		return auditLogEntityRepository.findById(id);
	}
}
