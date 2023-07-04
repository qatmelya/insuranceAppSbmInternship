package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("CarEngines")
public class CarEngine extends Parameter {
	private int carFuelTypeId;
	private int carEngineSizeId;

	public CarEngine(double scaleFactor, double valueFactor, int id, int carFuelTypeId, int carEngineSizeId) {
		super(id, scaleFactor, valueFactor);
		this.carFuelTypeId = carFuelTypeId;
		this.carEngineSizeId = carEngineSizeId;
	}

	public int getCarFuelTypeId() {
		return carFuelTypeId;
	}

	public void setCarFuelTypeId(int carFuelTypeId) {
		this.carFuelTypeId = carFuelTypeId;
	}

	public int getCarEngineSizeId() {
		return carEngineSizeId;
	}

	public void setCarEngineSizeId(int carEngineSizeId) {
		this.carEngineSizeId = carEngineSizeId;
	}

}
