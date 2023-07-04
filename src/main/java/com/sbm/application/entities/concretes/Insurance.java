package com.sbm.application.entities.concretes;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Entity;

@Table("Insurances")
public class Insurance extends Entity {

	@Column("companyId")
	private int companyId;
	@Column("insuranceTypeId")
	private int insuranceTypeId;
	@Column("basePrice")
	private double basePrice;

	public Insurance() {
		super(0);
	}

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
