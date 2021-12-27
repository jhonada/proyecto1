package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aspect")
public class AspectPoint {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	
	@Column(name="packageLog")
	private String packageLog;

	
	
	
	
	
	public AspectPoint(Long id, String PackageLog) {
		Id = id;
		packageLog = PackageLog;
	}
	
	public AspectPoint() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getPackageLog() {
		return packageLog;
	}

	public void setPackageLog(String PackageLog) {
		packageLog = PackageLog;
	}
	
	
	


}
