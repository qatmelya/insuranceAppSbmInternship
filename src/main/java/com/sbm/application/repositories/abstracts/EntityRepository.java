package com.sbm.application.repositories.abstracts;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sbm.application.entities.abstracts.Entity;


public interface EntityRepository<T extends Entity> extends ReactiveCrudRepository<T, Integer> {

}
