package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("CarModels")
public class CarModel extends Parameter {

	@Column("brandId")
	private int brandId;
	@Column("carTypeId")
	private int carTypeId;
	@Column("name")
	private String name;

	public CarModel() {
		super(0, 0, 0);
	}

	public CarModel(double scaleFactor, double valueFactor, int id, int brandId, int carTypeId, String name) {
		super(id, scaleFactor, valueFactor);
		this.brandId = brandId;
		this.carTypeId = carTypeId;
		this.name = name;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
