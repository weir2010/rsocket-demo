package com.example.demo.service;

import com.example.demo.entity.PersonDTO;

import reactor.core.publisher.Mono;

public interface PersonService {

	Mono<PersonDTO> get(Long id);

}
