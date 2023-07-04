package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("CarPackages")
public class CarPackage extends Parameter {

	private int carModelId;
	private int carEngineId;
	private int carTypeId;
	private String year;

	public CarPackage(double scaleFactor, double valueFactor, int id, int carModelId, int carEngineId, int carTypeId,
			String year) {
		super(id, scaleFactor, valueFactor);
		this.carModelId = carModelId;
		this.carEngineId = carEngineId;
		this.carTypeId = carTypeId;
		this.year = year;
	}

	public int getCarModelId() {
		return carModelId;
	}

	public void setCarModelId(int carModelId) {
		this.carModelId = carModelId;
	}

	public int getCarEngineId() {
		return carEngineId;
	}

	public void setCarEngineId(int carEngineId) {
		this.carEngineId = carEngineId;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
