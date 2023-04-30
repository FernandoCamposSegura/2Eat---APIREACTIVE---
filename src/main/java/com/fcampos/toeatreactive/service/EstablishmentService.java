package com.fcampos.toeatreactive.service;

import com.fcampos.toeatreactive.domain.Establishment;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EstablishmentService {
    Flux<Establishment> findAll();
    Mono<Establishment> findByCode(String code);
    Mono<Establishment> addEstablishment(Establishment establishment);
    Mono<Void> deleteEstablishment(String code);
}
