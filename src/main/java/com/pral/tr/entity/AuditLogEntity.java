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
@Table(name = "AUDIT_LOG")

public class AuditLogEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUDIT_ID")
	private Integer auditId;

	@Column(name = "AUDIT_OPERATION")
	private String auditOperation;

	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@Column(name = "AUDIT_LOG_TIME")
	private Date auditLogTime;

	public AuditLogEntity() {
		super();
	}

	public AuditLogEntity(Integer auditId, String auditOperation, Date auditLogTime) {
		super();
		this.auditId = auditId;
		this.auditOperation = auditOperation;
		this.auditLogTime = auditLogTime;
	}

	@Override
	public String toString() {
		return "AuditLogEntity [auditId=" + auditId + ", auditOperation=" + auditOperation + ", auditLogTime="
				+ auditLogTime + "]";
	}

	/**
	 * @return the auditId
	 */
	public Integer getAuditId() {
		return auditId;
	}

	/**
	 * @param auditId the auditId to set
	 */
	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	/**
	 * @return the auditOperation
	 */
	public String getAuditOperation() {
		return auditOperation;
	}

	/**
	 * @param auditOperation the auditOperation to set
	 */
	public void setAuditOperation(String auditOperation) {
		this.auditOperation = auditOperation;
	}

	/**
	 * @return the auditLogTime
	 */
	public Date getAuditLogTime() {
		return auditLogTime;
	}

	/**
	 * @param auditLogTime the auditLogTime to set
	 */
	public void setAuditLogTime(Date auditLogTime) {
		this.auditLogTime = auditLogTime;
	}

}
