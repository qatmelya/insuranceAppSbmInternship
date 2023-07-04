package com.sbm.application.entities.concretes;

import java.sql.Timestamp;

import org.springframework.data.relational.core.mapping.Table;

import com.sbm.application.entities.abstracts.Parameter;

@Table("Customers")
public class Customer extends Parameter {

    
    private int professionId;
    
    private int cityOfResidenceId;

    private String firstName;

    private String lastName;
    
    private String tc;
    
    private String phoneNumber;
    
    private Timestamp birthDate;
    
    private Timestamp licenseObtainedAt;

    public Customer() {
    	super(0,0, 0);
    	//Empty constructor is required to parse the json body from request
    }

    public Customer(double valueFactor, double scaleFactor, int id, int professionId, int cityOfResidenceId, String firstName,
			String lastName, String tc, String phoneNumber, Timestamp birthDate, Timestamp licenseObtainedAt) {
		super(id, scaleFactor, valueFactor);
		this.professionId = professionId;
		this.cityOfResidenceId = cityOfResidenceId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tc = tc;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.licenseObtainedAt = licenseObtainedAt;
	}

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getProfessionId() {
		return professionId;
	}

	public void setProfessionId(int professionId) {
		this.professionId = professionId;
	}

	public int getCityOfResidenceId() {
		return cityOfResidenceId;
	}

	public void setCityOfResidenceId(int cityOfResidenceId) {
		this.cityOfResidenceId = cityOfResidenceId;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public Timestamp getLicenseObainedAt() {
		return licenseObtainedAt;
	}

	public void setLicenseObainedAt(Timestamp licenseObainedAt) {
		this.licenseObtainedAt = licenseObainedAt;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, professionId=%s, cityOfResidenceId=%s, firstName=%s, lastName=%s, tc=%s, phoneNumber=%s, birthDate=%s, licenseObainedAt=%s, getScaleFactor()=%s, getValueFactor()=%s]",
				this.getId(), professionId, cityOfResidenceId, firstName, lastName, tc, phoneNumber, birthDate, licenseObtainedAt,
				this.getScaleFactor(),this.getValueFactor());
	}

}
