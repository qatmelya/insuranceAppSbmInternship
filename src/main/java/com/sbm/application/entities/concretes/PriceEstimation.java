package com.sbm.application.entities.concretes;

import java.sql.Timestamp;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Entity;

@Table("PriceEstimations")
public class PriceEstimation extends Entity {

	@Column("insuranceId")
	private int insuranceId;
	@Column("parameterId")
	private int parameterId;
	@Column("price")
	private double price;
	@Column("estimationDate")
	private Timestamp estimationDate;

	public PriceEstimation() {
		super(0);
	}

	public PriceEstimation(int id, int insuranceId, int parameterId, double price, Timestamp estimationDate) {
		super(id);
		this.insuranceId = insuranceId;
		this.parameterId = parameterId;
		this.price = price;
		this.estimationDate = estimationDate;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public int getParameterId() {
		return parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Timestamp getEstimationDate() {
		return estimationDate;
	}

	public void setEstimationDate(Timestamp estimationDate) {
		this.estimationDate = estimationDate;
	}

}
