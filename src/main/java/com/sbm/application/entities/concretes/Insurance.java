package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Entity;

@Table("Insurances")
public class Insurance extends Entity {

	private int companyId;
	private int insuranceTypeId;
	private double basePrice;

	public Insurance(int id, int companyId, int insuranceTypeId, double basePrice) {
		super(id);
		this.companyId = companyId;
		this.insuranceTypeId = insuranceTypeId;
		this.basePrice = basePrice;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getInsuranceTypeId() {
		return insuranceTypeId;
	}

	public void setInsuranceTypeId(int insuranceTypeId) {
		this.insuranceTypeId = insuranceTypeId;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
