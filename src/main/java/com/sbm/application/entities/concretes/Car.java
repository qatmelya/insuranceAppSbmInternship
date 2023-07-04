package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("Cars")
public class Car extends Parameter {

	private int customerId;
	private int cityId;
	private int carPackageId;
	private boolean isDamaged;
	private double estimatedValue;
	private String licensePlate;

	public Car(double scaleFactor, double valueFactor, int id, int customerId, int cityId, int carPackageId,
			boolean isDamaged, double estimatedValue, String licensePlate) {
		super(id, scaleFactor, valueFactor);
		this.customerId = customerId;
		this.cityId = cityId;
		this.carPackageId = carPackageId;
		this.isDamaged = isDamaged;
		this.estimatedValue = estimatedValue;
		this.licensePlate = licensePlate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCarPackageId() {
		return carPackageId;
	}

	public void setCarPackageId(int carPackageId) {
		this.carPackageId = carPackageId;
	}

	public boolean isDamaged() {
		return isDamaged;
	}

	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}

	public double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

}
