package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("Cities")
public class City extends Parameter {

	private String name;
	private String plateCode;

	public City(double scaleFactor, double valueFactor, int id, String name, String plateCode) {
		super(id, scaleFactor, valueFactor);
		this.name = name;
		this.plateCode = plateCode;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlateCode() {
		return plateCode;
	}

	public void setPlateCode(String plateCode) {
		this.plateCode = plateCode;
	}

}
