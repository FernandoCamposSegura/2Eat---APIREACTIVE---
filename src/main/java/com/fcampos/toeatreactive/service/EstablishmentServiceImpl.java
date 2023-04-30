package com.fcampos.toeatreactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcampos.toeatreactive.domain.Establishment;
import com.fcampos.toeatreactive.repository.EstablishmentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {

    @Autowired
    EstablishmentRepository establishmentRepository;

    @Override
    public Flux<Establishment> findAll() {
        return establishmentRepository.findAll();
    }

    @Override
    public Mono<Establishment> findByCode(String code) {
        return establishmentRepository.findByCode(code);
    }

    @Override
    public Mono<Establishment> addEstablishment(Establishment establishment) {
        return establishmentRepository.save(establishment);
    }

    @Override
    public Mono<Void> deleteEstablishment(String code) {
        Mono<Establishment> establishment = establishmentRepository.findByCode(code);
        return establishmentRepository.delete(establishment.block());
    }
    
}
