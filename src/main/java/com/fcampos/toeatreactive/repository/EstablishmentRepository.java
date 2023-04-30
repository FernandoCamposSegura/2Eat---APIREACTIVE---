package com.fcampos.toeatreactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.fcampos.toeatreactive.domain.Establishment;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface EstablishmentRepository extends ReactiveMongoRepository<Establishment, String> {
    Flux<Establishment> findAll();
    Mono<Establishment> findByCode(String code);
}
