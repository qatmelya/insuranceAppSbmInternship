package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("Professions")
public class Profession extends Parameter {

	@Column("Name")
	private String name;

	public Profession() {
		super(0, 0, 0);
	}

	public Profession(double scaleFactor, double valueFactor, int id, String name) {
		super(id, scaleFactor, valueFactor);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Profession [name=%s, scaleFactor=%s, valueFactor=%s, id=%s]", name, getScaleFactor(),
				getValueFactor(), getId());
	}
}
