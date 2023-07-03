package com.sbm.application;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Customers")
public class Customer {

    @Id
    private Long id;

    @Column("FirstName")
    private String firstName;

    @Column("LastName")
    private String lastName;

    public Customer() {
    	//Empty constructor is required to parse the json body from request
    }
    
    public Customer(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
    }

}
