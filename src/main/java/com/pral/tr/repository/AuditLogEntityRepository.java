package com.pral.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pral.tr.entity.AuditLogEntity;

@Repository
public interface AuditLogEntityRepository extends JpaRepository<AuditLogEntity, Integer>{

}
