package com.fcampos.toeatreactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fcampos.toeatreactive.domain.Establishment;
import com.fcampos.toeatreactive.service.EstablishmentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EstablismentController {
    
    @Autowired
    private EstablishmentService establishmentService;

    @GetMapping(value = "/establishments", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Establishment> getEstablishments() {
        return establishmentService.findAll();
    }

    @GetMapping(value = "/establishments/{code}")
    public Mono<Establishment> getEstablishmentsByCode(@PathVariable String code) {
        return establishmentService.findByCode(code);
    }

    @PostMapping(value = "/code")
    public Mono<Establishment> addEstablishment(@RequestBody Establishment establishment) {
        return establishmentService.addEstablishment(establishment);
    }

    @DeleteMapping(value = "/establishments/{code}")
    public Mono<Void> deleteEstablishment(@PathVariable String code) {
        return establishmentService.deleteEstablishment(code);
    }
}
