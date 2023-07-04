package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("CarEngineSizes")
public class CarEngineSize extends Parameter {

	private String size;

	public CarEngineSize(double scaleFactor, double valueFactor, int id, String size) {
		super(id, scaleFactor, valueFactor);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
