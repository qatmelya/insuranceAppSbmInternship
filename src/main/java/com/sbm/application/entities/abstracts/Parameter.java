package com.sbm.application.entities.abstracts;

public abstract class Parameter extends Entity {

	public Parameter(int id, double scaleFactor, double valueFactor) {
		super(id);
		this.scaleFactor = scaleFactor;
		this.valueFactor = valueFactor;
	}

	// Floating-point between 0 and 1: used to scale the basePrice of the insurance
	// Higher means greater the price, eg. 0,57 means increment the price by %57
	private double scaleFactor;

	// Price value to increment the insurance price statically and not by ratio
	private double valueFactor;

	public double getScaleFactor() {
		return scaleFactor;
	}

	public void setScaleFactor(double scaleFactor) {
		this.scaleFactor = scaleFactor;
	}

	public double getValueFactor() {
		return valueFactor;
	}

	public void setValueFactor(double valueFactor) {
		this.valueFactor = valueFactor;
	}
}
