package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("CarTypes")
public class CarType extends Parameter {

	@Column("name")
	private String name;

	public CarType() {
		super(0, 0, 0);
	}

	public CarType(double scaleFactor, double valueFactor, int id, String name) {
		super(id, scaleFactor, valueFactor);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
