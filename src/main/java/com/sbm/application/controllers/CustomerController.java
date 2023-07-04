package com.sbm.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sbm.application.Application;
import com.sbm.application.entities.Customer;
import com.sbm.application.repositories.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class CustomerController {
	private final CustomerRepository customerRepository;
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Customer> createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
	
	@GetMapping("/")
    public Flux<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
