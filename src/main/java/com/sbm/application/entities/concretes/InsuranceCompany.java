package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Entity;

@Table("InsuranceCompanies")
public class InsuranceCompany extends Entity {

	@Column("name")
	private String name;

	public InsuranceCompany() {
		super(0);
	}

	public InsuranceCompany(int id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
