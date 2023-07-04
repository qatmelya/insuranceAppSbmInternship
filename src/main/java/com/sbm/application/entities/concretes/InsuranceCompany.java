package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

@Table("InsuranceCompanies")
public class InsuranceCompany {

	private int id;
	private String name;
	public InsuranceCompany(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
