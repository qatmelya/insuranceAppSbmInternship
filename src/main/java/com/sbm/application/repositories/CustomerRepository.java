package com.sbm.application.repositories;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sbm.application.entities.Customer;

import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long>{
	@Query("SELECT * FROM customer WHERE last_name = :lastname")
    Flux<Customer> findByLastName(String lastName);
}
