package com.pral.tr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "TRANSACTION_MASTER")

public class TransactionMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSACTION_NO")
	private Integer transactionNo;

	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;

	@Column(name = "INITIATED_BY")
	private String initiatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@Column(name = "transactionTime")
	private Date transactionTime;

	public TransactionMasterEntity() {
		super();
	}

	public TransactionMasterEntity(Integer transactionNo, String transactionType, String initiatedBy,
			Date transactionTime) {
		super();
		this.transactionNo = transactionNo;
		this.transactionType = transactionType;
		this.initiatedBy = initiatedBy;
		this.transactionTime = transactionTime;
	}

	/**
	 * @return the transactionNo
	 */
	public Integer getTransactionNo() {
		return transactionNo;
	}

	/**
	 * @param transactionNo the transactionNo to set
	 */
	public void setTransactionNo(Integer transactionNo) {
		this.transactionNo = transactionNo;
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the initiatedBy
	 */
	public String getInitiatedBy() {
		return initiatedBy;
	}

	/**
	 * @param initiatedBy the initiatedBy to set
	 */
	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	/**
	 * @return the transactionTime
	 */
	public Date getTransactionTime() {
		return transactionTime;
	}

	/**
	 * @param transactionTime the transactionTime to set
	 */
	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	@Override
	public String toString() {
		return "TransactionMasterEntity [transactionNo=" + transactionNo + ", transactionType=" + transactionType
				+ ", initiatedBy=" + initiatedBy + ", transactionTime=" + transactionTime + "]";
	}

}
