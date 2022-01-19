package com.pral.tr.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pral.tr.entity.AuditLogEntity;
import com.pral.tr.service.AuditLogEntityService;

@RestController(value = "/api/audit")
public class AuditController{
	
	@Autowired
	private AuditLogEntityService auditLogEntityService;
	
	@GetMapping("/{id}")
	public Optional<AuditLogEntity> getAuditLogUsingID(@PathVariable("id") Integer id) {
		
		return auditLogEntityService.findById(id);
		
	}
	
	@PostMapping
	public void updateLog(@RequestBody AuditLogEntity auditLogEntity) {
		
		
		auditLogEntityService.save(auditLogEntity);
		
	}

}
