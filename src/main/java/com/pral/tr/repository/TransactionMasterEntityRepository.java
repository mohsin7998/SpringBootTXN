package com.pral.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pral.tr.entity.TransactionMasterEntity;

@Repository
public interface TransactionMasterEntityRepository extends JpaRepository<TransactionMasterEntity, Integer> {

}
