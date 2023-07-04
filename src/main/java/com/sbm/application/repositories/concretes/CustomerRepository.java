package com.sbm.application.repositories.concretes;

import org.springframework.data.r2dbc.repository.Query;

import com.sbm.application.entities.concretes.Customer;
import com.sbm.application.repositories.abstracts.EntityRepository;

import reactor.core.publisher.Flux;

public interface CustomerRepository extends EntityRepository<Customer>{
	@Query("SELECT * FROM customer WHERE last_name = :lastname")
    Flux<Customer> findByLastName(String lastName);
}
