package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Entity;

@Table("InsuranceTypes")
public class InsuranceType extends Entity {

	@Column("name")
	private String name;
	@Column("parameterTable")
	private String parameterTable;

	public InsuranceType() {
		super(0);
	}

	public InsuranceType(int id, String name, String parameterTable) {
		super(id);
		this.name = name;
		this.parameterTable = parameterTable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameterTable() {
		return parameterTable;
	}

	public void setParameterTable(String parameterTable) {
		this.parameterTable = parameterTable;
	}

}
